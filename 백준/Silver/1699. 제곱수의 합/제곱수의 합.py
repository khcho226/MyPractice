import sys

n = int(sys.stdin.readline())
dy = [i for i in range(n + 1)]

for i in range(1, n + 1):
    for j in range(1, i):
        if j * j > i:
            break

        if dy[i] > dy[i - j * j] + 1:
            dy[i] = dy[i - j * j] + 1

print(dy[n])