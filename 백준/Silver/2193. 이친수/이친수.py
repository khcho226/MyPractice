import sys

dyn = [[0 for i in range(2)] for i in range(91)]
dyn[1] = [0, 1]
dyn[2] = [1, 0]

for i in range(3, 91):
    dyn[i][0] = dyn[i - 1][0] + dyn[i - 1][1]
    dyn[i][1] = dyn[i - 1][0]

print(sum(dyn[int(sys.stdin.readline())]))