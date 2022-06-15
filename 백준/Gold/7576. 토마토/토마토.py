import sys
from collections import deque
sys.setrecursionlimit(10000)

m, n = map(int, sys.stdin.readline().split())
maze = [[0] * m for _ in range(n)]
que = deque([])

for i in range(n):
    maze_list = list(map(int, sys.stdin.readline().split()))
    for j in range(m):
        maze[i][j] = maze_list[j]
        if maze_list[j] == 1:
            que.append((i, j))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

while que:
    x, y = que.popleft()
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < m and maze[nx][ny] == 0:
            maze[nx][ny] = maze[x][y] + 1
            que.append((nx, ny))

maxi = 0
for i in range(n):
    for j in range(m):
        if maze[i][j] == 0:
            print(-1)
            exit()
        maxi = max(maxi, maze[i][j])

print(maxi - 1)