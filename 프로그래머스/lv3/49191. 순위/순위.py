def solution(n, results):
    answer = 0
    arr = [[0] * n for _ in range(n)]
    
    for a, b in results:
        arr[a - 1][b - 1] = 1
        arr[b - 1][a - 1] = -1
        
    for k in range(n):
        for i in range(n):
            for j in range(n):
                if i == j or arr[i][j] in [1, -1]:
                    continue
                
                if arr[i][k] == arr[k][j] == 1:
                    arr[i][j] = 1
                    arr[j][i] = arr[k][i] = arr[j][k] = -1
                    
    for i in arr:
        if i.count(0) == 1:
            answer += 1
    
    return answer