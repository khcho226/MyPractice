def solution(distance, rocks, n):
    rocks.sort()
    rocks.append(distance)
    left, right = 1, distance
    
    while left <= right:
        mid = (left + right) // 2
        cnt, stone = 0, 0
        
        for rock in rocks:
            if rock - stone < mid:
                cnt += 1
            else:
                stone = rock
                
        if cnt > n:
            right = mid - 1
        else:
            left = mid + 1
               
    return right