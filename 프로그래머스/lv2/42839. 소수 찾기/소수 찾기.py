from itertools import permutations

def solution(numbers):
    per = []
    
    for i in range(1, len(list(numbers)) + 1):
        per += list(permutations(numbers, i))
        
    nums = set([int("".join(p)) for p in per])
    cnt = 0
    
    for i in nums:
        check = True
        
        if i < 2:
            continue
        
        for j in range(2, int(i ** 0.5) + 1):
            if i % j == 0:
                check = False
                break
    
        if check:
            cnt += 1
    
    return cnt