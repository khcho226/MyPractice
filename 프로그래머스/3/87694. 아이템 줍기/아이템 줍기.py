from collections import deque

def solution(rectangle, characterX, characterY, itemX, itemY):
    arr = [[-1 for _ in range(102)] for _ in range(102)]
    visited = [[1 for _ in range(102)] for _ in range(102)]

    for r in rectangle:
        x1, y1, x2, y2 = map(lambda x: x * 2, r)

        for i in range(x1, x2 + 1):
            for j in range(y1, y2 + 1):
                if x1 < i < x2 and y1 < j < y2:
                    arr[i][j] = 0
                elif arr[i][j] != 0:
                    arr[i][j] = 1

    sx, sy, ex, ey = 2 * characterX, 2 * characterY, 2 * itemX, 2 * itemY
    que = deque([(sx, sy)])
    answer = 0
    d = [(0, 1), (1, 0), (0, -1), (-1, 0)]

    while que:
        x, y = que.popleft()

        if x == ex and y == ey:
            answer = visited[x][y] // 2
            break

        for k in range(4):
            nx, ny = x + d[k][0], y + d[k][1]

            if arr[nx][ny] == 1 and visited[nx][ny] == 1:
                visited[nx][ny] += visited[x][y]
                que.append((nx, ny))

    return answer