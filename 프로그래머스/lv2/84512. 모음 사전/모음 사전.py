words = []
lst = ["A", "E", "I", "O", "U"]

def solution(word):
    dfs("")
    
    return words.index(word)

def dfs(input):
    words.append(input)
    
    if len(input) == 5:
        return
    
    for i in lst:
        dfs(input + i)