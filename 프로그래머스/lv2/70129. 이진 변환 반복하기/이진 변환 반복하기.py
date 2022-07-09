def solution(s):
    _try, num = 0, 0
    
    while True:
        _try += 1
        num1 = s.count("1")      
        num += len(s) - num1
        
        if num1 == 1:
            return [_try, num]
        
        s = str(bin(num1)[2:])