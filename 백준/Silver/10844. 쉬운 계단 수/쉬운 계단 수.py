import sys

dyn = [[0 for i in range(10)] for i in range(101)]
dyn[1] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1]

for i in range(2, 101):
    for j in range(10):
        if j == 0:
            dyn[i][j] = dyn[i - 1][j + 1] % 1000000000

        elif j == 9:
            dyn[i][j] = dyn[i - 1][j - 1] % 1000000000

        else:
            dyn[i][j] = (dyn[i - 1][j + 1] + dyn[i - 1][j - 1]) % 1000000000

print(sum(dyn[int(sys.stdin.readline())]) % 1000000000)