import sys
sys.setrecursionlimit(10000)

dx = [-1, 1, 0, 0, -1, 1, -1, 1]
dy = [0, 0, -1, 1, -1, -1, 1, 1]

def dfs(x, y):
    visited[x][y] = True

    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < h and 0 <= ny < w:
            if isl[nx][ny] == 1 and not visited[nx][ny]:
                dfs(nx, ny)

while True:
    w, h = map(int, sys.stdin.readline().split())
    if w == 0 and h == 0:
        break

    isl = [[0] * w for _ in range(h)]
    visited = [[False] * w for _ in range(h)]

    for i in range(h):
        isl_list = list(sys.stdin.readline().strip().split())
        for j in range(w):
            isl[i][j] = int(isl_list[j])

    cnt = 0
    for i in range(h):
        for j in range(w):
            if isl[i][j] == 1 and not visited[i][j]:
                dfs(i, j)
                cnt += 1

    print(cnt)