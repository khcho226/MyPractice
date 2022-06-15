import sys
from collections import deque

m, n = map(int, sys.stdin.readline().split())
maze = [[0] * m for _ in range(n)]
for i in range(n):
    for j, a in enumerate(sys.stdin.readline().strip()):
        maze[i][j] = int(a)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
que = deque([(0, 0)])
visited = [[0] * m for _ in range(n)]
visited[0][0] = 1

while que:
    x, y = que.popleft()
    if x == n - 1 and y == m - 1:
        print(visited[x][y] - 1)
        break

    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < m:
            if visited[nx][ny] == 0:
                if maze[nx][ny] == 0:
                    que.appendleft((nx, ny))
                    visited[nx][ny] = visited[x][y]
                else:
                    que.append((nx, ny))
                    visited[nx][ny] = visited[x][y] + 1