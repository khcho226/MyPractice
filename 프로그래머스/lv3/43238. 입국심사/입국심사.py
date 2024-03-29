def solution(n, times):
    answer = 0
    left, right = 0, max(times) * n
    
    while left <= right:
        mid = (left + right) // 2
        check = 0
        
        for time in times:
            check += mid // time
            
            if check >= n:
                break
    
        if check >= n:
            answer = mid
            right = mid - 1
        else:
            left = mid + 1
    
    return answer