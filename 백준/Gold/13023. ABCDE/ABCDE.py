import sys

n, m = map(int, sys.stdin.readline().split())
arr = [[] for i in range(n)]
visited = [False] * n

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    arr[a].append(b)
    arr[b].append(a)

def dfs(idx, num):
    if num == 5:
        print(1)
        exit()

    for i in arr[idx]:
        if not visited[i]:
            visited[i] = True
            dfs(i, num + 1)
            visited[i] = False


for i in range(n):
    visited[i] = True
    dfs(i, 1)
    visited[i] = False

print(0)