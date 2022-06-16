import sys

n, k = map(int, sys.stdin.readline().split())
coins = []
for i in range(n):
    coins.append(int(sys.stdin.readline()))

num = 0
for i in range(n):
    num += k // coins[n - i - 1]
    k = k % coins[n - i - 1]

print(num)