import math

def solution(arr):
    nums = [int(x) for x in arr[::2]]
    ops = arr[1::2]
    len_nums = len(nums)

    max_dp = [[-math.inf for _ in range(len_nums)] for _ in range(len_nums)]
    min_dp = [[math.inf for _ in range(len_nums)] for _ in range(len_nums)]

    for i in range(len_nums):
        max_dp[i][i] = nums[i]
        min_dp[i][i] = nums[i]

    for s in range(1, len_nums):
        for i in range(len_nums - s):
            j = s + i

            for k in range(i, j):
                if ops[k] == '+':
                    max_dp[i][j] = max(max_dp[i][j], max_dp[i][k] + max_dp[k + 1][j])
                    min_dp[i][j] = min(min_dp[i][j], min_dp[i][k] + min_dp[k + 1][j])
                else:
                    max_dp[i][j] = max(max_dp[i][j], max_dp[i][k] - min_dp[k + 1][j])
                    min_dp[i][j] = min(min_dp[i][j], min_dp[i][k] - max_dp[k + 1][j])

    return max_dp[0][len_nums - 1]