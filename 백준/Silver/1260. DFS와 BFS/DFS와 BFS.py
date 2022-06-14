import sys
from collections import deque

n, m, v = map(int, sys.stdin.readline().split())
arr = [[] for i in range(n + 1)]
visited = [False] * (n + 1)

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    arr[a].append(b)
    arr[b].append(a)

for i in range(n + 1):
    arr[i].sort()

def dfs(v):
    print(v, end = " ")
    visited[v] = True

    for i in arr[v]:
        if not visited[i]:
            dfs(i)

def bfs(v):
    que = deque([v])
    visited[v] = True

    while que:
        now = que.popleft()
        print(now, end = " ")

        for i in arr[now]:
            if not visited[i]:
                que.append(i)
                visited[i] = True

dfs(v)
visited = [False] * (n + 1)
print()
bfs(v)