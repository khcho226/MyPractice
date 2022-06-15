import sys
from collections import deque
sys.setrecursionlimit(10000)

n, k = map(int, sys.stdin.readline().split())
loc = [0] * 100001
path = [0] * 100001
loc[n] = 1
que = deque([n])

while que:
    x = que.popleft()

    if x == k:
        print(loc[x] - 1)
        temp = x
        arr = []
        for i in range(loc[x]):
            arr.append(temp)
            temp = path[temp]
        print(*reversed(arr))
        break

    for i in (x - 1, x + 1, x + x):
        if 0 <= i <= 100000 and loc[i] == 0:
            loc[i] = loc[x] + 1
            path[i] = x
            que.append(i)