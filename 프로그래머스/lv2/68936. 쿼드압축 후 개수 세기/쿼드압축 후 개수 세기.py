def solution(arr):
    length = le = len(arr)
    
    while le > 1:   
        for i in range(length // le):
            for j in range(length // le):
                check = True
                temp = arr[i * le][j * le]
                
                for x in range(le):
                    for y in range(le):
                        if arr[i * le + x][j * le + y] != temp:
                            check = False
                            break
                            
                if check:
                    for x in range(le):
                        for y in range(le):
                            arr[i * le + x][j * le + y] = 2
                            
                arr[i * le][j * le] = temp
            
        le //= 2
    
    num0, num1 = 0, 0
    
    for i in arr:
        for j in i:
            if j == 0:
                num0 += 1
            elif j == 1:
                num1 += 1
    
    return [num0, num1]