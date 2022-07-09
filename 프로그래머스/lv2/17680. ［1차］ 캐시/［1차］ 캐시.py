def solution(cacheSize, cities):   
    if cacheSize == 0:
        return len(cities) * 5
    
    answer = 0
    lst = []
    
    for city in cities:
        city = city.upper()
        
        if city not in lst:
            if len(lst) == cacheSize:
                lst.pop(0)
                
            answer += 5
            lst.append(city)
        
        else:
            answer += 1
            lst.remove(city)
            lst.append(city)
            
    return answer