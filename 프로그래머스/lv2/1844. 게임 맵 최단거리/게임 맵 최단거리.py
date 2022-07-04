from collections import deque

def solution(maps):
    que = deque([])
    que.append([0, 0])
    dx, dy = [0, 1, 0, -1], [-1, 0, 1, 0]
    lenx, leny = len(maps[0]), len(maps)
    visited = [[-1 for _ in range(lenx)] for _ in range(leny)]
    visited[0][0] = 1
    
    while que:
        y, x = que.popleft()

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            
            if 0 <= nx < lenx and 0 <= ny < leny and maps[ny][nx] == 1:
                if visited[ny][nx] == -1:
                    que.append([ny, nx])
                    visited[ny][nx] = visited[y][x] + 1
                
    return visited[-1][-1]