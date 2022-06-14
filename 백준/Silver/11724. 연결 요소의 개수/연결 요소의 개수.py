import sys
sys.setrecursionlimit(10000)

n, m, = map(int, sys.stdin.readline().split())
arr = [[] for i in range(n + 1)]
visited = [False] * (n + 1)
cnt = 0

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    arr[a].append(b)
    arr[b].append(a)

def dfs(start):
    visited[start] = True

    for i in arr[start]:
        if not visited[i]:
            dfs(i)

for i in range(1, n + 1):
    if not visited[i]:
        cnt += 1
        dfs(i)

print(cnt)