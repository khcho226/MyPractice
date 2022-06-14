import sys

dyn = [[0 for i in range(3)] for i in range(100001)]
dyn[1] = [1, 0, 0]
dyn[2] = [0, 1, 0]
dyn[3] = [1, 1, 1]

for i in range(4, 100001):
    dyn[i][0] = (dyn[i - 1][1] + dyn[i - 1][2]) % 1000000009
    dyn[i][1] = (dyn[i - 2][0] + dyn[i - 2][2]) % 1000000009
    dyn[i][2] = (dyn[i - 3][0] + dyn[i - 3][1]) % 1000000009

n = int(sys.stdin.readline())

for i in range(n):
    print(sum(dyn[int(sys.stdin.readline())]) % 1000000009)