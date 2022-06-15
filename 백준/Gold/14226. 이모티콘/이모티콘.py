import sys
from collections import deque
sys.setrecursionlimit(10000)

s = int(sys.stdin.readline())
loc = [[0] * 1001 for _ in range(1001)]
loc[1][0] = 1
que = deque([(1, 0)])

while que:
    x, c = que.popleft()

    if x == s:
        print(loc[x][c] - 1)
        break

    if loc[x][x] == 0:
        loc[x][x] = loc[x][c] + 1
        que.append((x, x))

    if x + c <= 1000 and loc[x + c][c] == 0:
        loc[x + c][c] = loc[x][c] + 1
        que.append((x + c, c))

    if 0 <= x - 1 and loc[x - 1][c] == 0:
        loc[x - 1][c] = loc[x][c] + 1
        que.append((x - 1, c))