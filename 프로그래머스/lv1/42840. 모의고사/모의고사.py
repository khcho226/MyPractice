def solution(answers):
    ans = [[1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    arr = []
    result = []
    
    for i in ans:
        correct = 0
        
        for idx, answer in enumerate(answers):
            if i[idx % len(i)] == answer:
                correct += 1
                
        arr.append(correct)
        
    for idx, it in enumerate(arr):
        if it == max(arr):
            result.append(idx + 1)
    
    return result