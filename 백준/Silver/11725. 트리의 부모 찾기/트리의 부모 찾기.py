import sys
sys.setrecursionlimit(10 ** 6)

n = int(sys.stdin.readline())
arr = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)

for i in range(n - 1):
    a, b = map(int, sys.stdin.readline().split())
    arr[a].append(b)
    arr[b].append(a)

def dfs(start):
    for i in arr[start]:
        if not visited[i]:
            visited[i] = start
            dfs(i)

dfs(1)
for i in range(2, n + 1):
    print(visited[i])