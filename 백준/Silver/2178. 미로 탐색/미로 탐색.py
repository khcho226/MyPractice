import sys
from collections import deque
sys.setrecursionlimit(10000)

n, m = map(int, sys.stdin.readline().split())
maze = [[0] * m for _ in range(n)]

for i in range(n):
    for j, a in enumerate(sys.stdin.readline().strip()):
        maze[i][j] = int(a)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
que = deque([(0, 0)])
cnt = 0

while que:
    x, y = que.popleft()
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < m:
            if maze[nx][ny] == 1:
                maze[nx][ny] = maze[x][y] + 1
                que.append((nx, ny))

print(maze[n - 1][m - 1])