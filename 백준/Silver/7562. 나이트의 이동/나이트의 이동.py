import sys
from collections import deque
sys.setrecursionlimit(10000)

n = int(sys.stdin.readline())
dx = [-2, -1, 1, 2, -2, -1, 1, 2]
dy = [-1, -2, -2, -1, 1, 2, 2, 1]

for i in range(n):
    size = int(sys.stdin.readline())
    sx, sy = map(int, sys.stdin.readline().split())
    ex, ey = map(int, sys.stdin.readline().split())

    chess = [[0] * size for _ in range(size)]
    chess[sx][sy] = 1
    que = deque([(sx, sy)])

    while que:
        x, y = que.popleft()
        if x == ex and y == ey:
            print(chess[x][y] - 1)
            break

        for j in range(8):
            nx, ny = x + dx[j], y + dy[j]
            if 0 <= nx < size and 0 <= ny < size and chess[nx][ny] == 0:
                chess[nx][ny] = chess[x][y] + 1
                que.append((nx, ny))