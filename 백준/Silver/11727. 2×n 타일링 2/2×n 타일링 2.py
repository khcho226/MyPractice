import sys

a = int(sys.stdin.readline())
memo = [0] * 1001
memo[1] = 1
memo[2] = 3

for i in range(3, a + 1):
    memo[i] = memo[i - 1] + 2 * memo[i - 2]

print(memo[a] % 10007)