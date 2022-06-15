import sys
from collections import deque
sys.setrecursionlimit(10 ** 6)

n = int(sys.stdin.readline())
graph = [[] for _ in range(n + 1)]

for i in range(n - 1):
    root, child, length = list(map(int, sys.stdin.readline().split()))
    graph[root].append((child, length))
    graph[child].append((root, length))

def bfs(start):
    visited = [-1] * (n + 1)
    visited[start] = 0
    que = deque([start])
    _max = [0, 0]

    while que:
        x = que.popleft()
        for a, b in graph[x]:
            if visited[a] == -1:
                que.append(a)
                visited[a] = visited[x] + b
                if _max[0] < visited[a]:
                    _max = visited[a], a

    return _max

dis, node = bfs(1)
dis, node = bfs(node)
print(dis)