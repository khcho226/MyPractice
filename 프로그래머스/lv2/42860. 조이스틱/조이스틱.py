def solution(name):
    answer = 0
    move = len(name) - 1
    
    for i, char in enumerate(name):
        answer += min(ord(char) - 65, 91 - ord(char))
        next = i + 1
        
        while next < len(name) and name[next] == "A":
            next += 1
            
        move = min([move, 2 * i + len(name) - next, i + 2 * (len(name) - next)])
        
    return answer + move