def solution(routes):
    routes.sort(key=lambda x: x[1])
    camera, answer = -30001, 0
            
    for i in routes:
        if camera < i[0]:
            camera = i[1]
            answer += 1
    
    return answer