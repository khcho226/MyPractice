from collections import deque

def solution(n, wires):
    global graph
    
    graph = [[] for _ in range(n + 1)]
    ans = n
    
    for a, b in wires:
        graph[a].append(b)
        graph[b].append(a)
        
    for a, b in wires:
        ans = min(ans, abs(2 * bfs(a, b) - n))
    
    return ans

def bfs(start, end):
    list = [start]
    q = deque([])
    
    for i in graph[start]:
        if i != end:
            list.append(i)
            q.append(i)
        
    while q:
        for i in graph[q.popleft()]:
            if i not in list:
                list.append(i)
                q.append(i)
                
    return len(list)