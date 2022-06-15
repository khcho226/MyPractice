import sys
from collections import deque
sys.setrecursionlimit(10000)

n, k = map(int, sys.stdin.readline().split())
loc = [0] * 100001
loc[n] = 1
que = deque([n])

while que:
    x = que.popleft()

    if x == k:
        print(loc[x] - 1)
        break

    if 2 * x <= 100000 and loc[2 * x] == 0:
        que.appendleft(2 * x)
        loc[2 * x] = loc[x]

    if x + 1 <= 100000 and loc[x + 1] == 0:
        que.append(x + 1)
        loc[x + 1] = loc[x] + 1

    if 0 <= x - 1 and loc[x - 1] == 0:
        que.append(x - 1)
        loc[x - 1] = loc[x] + 1