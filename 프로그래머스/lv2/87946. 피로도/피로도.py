from itertools import permutations

def solution(k, dungeons):
    answer = 0
    
    for i in permutations(dungeons, len(dungeons)):
        hp = k
        cnt = 0
        
        for j in i:
            if hp >= j[0]:
                hp -= j[1]
                cnt += 1
                
        if answer < cnt:
            answer = cnt
    
    return answer