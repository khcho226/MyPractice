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

    if x - 1 >= 0 and loc[x - 1] == 0:
        loc[x - 1] = loc[x] + 1
        que.append(x - 1)

    if x + 1 <= 100000 and loc[x + 1] == 0:
        loc[x + 1] = loc[x] + 1
        que.append(x + 1)

    if x + x <= 100000 and loc[x + x] == 0:
        loc[x + x] = loc[x] + 1
        que.append(x + x)