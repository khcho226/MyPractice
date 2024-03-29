def solution(people, limit):
    people.sort()
    i, j, answer = 0, len(people) - 1, 0
    
    while i <= j:
        answer += 1
        
        if people[i] + people[j] <= limit:
            i += 1
            
        j -= 1
        
    return answer