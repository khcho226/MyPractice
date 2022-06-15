import sys

n = int(sys.stdin.readline())
home = [[0] * n for _ in range(n)]
visited = [[False] * n for _ in range(n)]

for i in range(n):
    line = sys.stdin.readline().strip()
    for j, a in enumerate(line):
        home[i][j] = int(a)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(x, y):
    global num
    visited[x][y] = True
    num += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < n:
            if home[nx][ny] == 1 and not visited[nx][ny]:
                dfs(nx, ny)

num_list = []
for i in range(n):
    for j in range(n):
        if home[i][j] == 1 and not visited[i][j]:
            num = 0
            dfs(i, j)
            num_list.append(num)

print(len(num_list))
for i in sorted(num_list):
    print(i)