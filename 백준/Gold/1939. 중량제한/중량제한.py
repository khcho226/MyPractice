import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())
g = [[] for _ in range(n + 1)]
for _ in range(m):
    a, b, c = map(int, sys.stdin.readline().split())
    g[a].append([b, c])
    g[b].append([a, c])
loc1, loc2 = map(int, sys.stdin.readline().split())


def bfs(num):
    visited[loc1] = 1
    q = deque([loc1])

    while q:
        start = q.popleft()
        if start == loc2:
            return True
        for x, y in g[start]:
            if visited[x] == 0 and mid <= y:
                q.append(x)
                visited[x] = 1
    return False


low, high = 1, 1000000000
while low <= high:
    visited = [0 for _ in range(n + 1)]
    mid = (low + high) // 2

    if bfs(mid):
        low = mid + 1
    else:
        high = mid - 1

print(high)
