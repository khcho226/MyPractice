def dfs(n, computers, i):
    visited[i] = True
    
    for j in range(n):
        if not visited[j] and computers[i][j] == 1:
            dfs(n, computers, j)

def solution(n, computers):
    global visited
    
    answer = 0
    visited = [False] * n
    
    for i in range(n):
        if not visited[i]:
            answer += 1
            dfs(n, computers, i)
            
    return answer