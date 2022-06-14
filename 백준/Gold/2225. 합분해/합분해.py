import sys

n, k = map(int, sys.stdin.readline().split())
nums = [0 for i in range(n + 1)]
nums[0] = 1

for i in range(1, k + 1):
    for j in range(1, n + 1):
        nums[j] = (nums[j] + nums[j - 1]) % 1000000000

print(nums[n] % 1000000000)