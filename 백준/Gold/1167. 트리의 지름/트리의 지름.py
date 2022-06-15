import sys
from collections import deque
sys.setrecursionlimit(10 ** 6)

n = int(sys.stdin.readline())
graph = [[] for _ in range(n + 1)]

for i in range(n):
    nums = list(map(int, sys.stdin.readline().split()))
    for j in range(1, len(nums) - 2, 2):
        graph[nums[0]].append((nums[j], nums[j + 1]))

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