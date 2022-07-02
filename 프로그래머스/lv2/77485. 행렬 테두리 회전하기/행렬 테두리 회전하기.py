def solution(rows, columns, queries):
    answer = []   
    arr = [[x for x in range(y * columns + 1, (y + 1) * columns + 1)] for y in range(rows)]
    
    for query in queries:
        x1, y1 = query[0], query[1]
        x2, y2 = query[2], query[3]
        temp = num = arr[x1 - 1][y1 - 1]
        
        for i in range(x2 - x1):
            num = min(num, arr[x1 + i][y1 - 1])
            arr[x1 - 1 + i][y1 - 1] = arr[x1 + i][y1 - 1]
            
        for i in range(y2 - y1):
            num = min(num, arr[x2 - 1][y1 + i])
            arr[x2 - 1][y1 - 1 + i] = arr[x2 - 1][y1 + i]
            
        for i in range(x2 - x1):
            num = min(num, arr[x2 - 2 - i][y2 - 1])
            arr[x2 - 1 - i][y2 - 1] = arr[x2 - 2 - i][y2 - 1]
        
        for i in range(y2 - y1):
            num = min(num, arr[x1 - 1][y2 - 2 - i])
            arr[x1 - 1][y2 - 1 - i] = arr[x1 - 1][y2 - 2 - i]
        
        arr[x1 - 1][y1] = temp
        answer.append(num)
    
    return answer