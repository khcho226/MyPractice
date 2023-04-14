def solution(distance, rocks, n):
    rocks.sort()
    answer = 0
    left, right = 1, distance - rocks[0]
    
    while left <= right:
        mid = (left + right) // 2
        cnt, stone = 0, 0
        
        for rock in rocks:
            if rock - stone < mid:
                cnt += 1
            else:
                stone = rock
            
            if cnt > n:
                break
                
        if cnt > n:
            right = mid - 1
        else:
            answer = mid
            left = mid + 1
               
    return answer