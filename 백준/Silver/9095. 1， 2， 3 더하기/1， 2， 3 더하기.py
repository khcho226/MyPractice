import sys

a = int(sys.stdin.readline())
nums = []
max = 0

for i in range(a):
    n = int(sys.stdin.readline())
    nums.append(n)

    if n > max:
        max = n

memo = [0] * (max + 1)
memo[1] = 1
memo[2] = 2
memo[3] = 4

for i in range(4, max + 1):
    memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3]

for i in nums:
    print(memo[i])