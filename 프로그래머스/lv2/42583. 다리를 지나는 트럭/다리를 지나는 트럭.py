from collections import deque

def solution(bridge_length, weight, truck_weights):
    bridge = deque([0] * bridge_length)
    wait = deque(truck_weights)
    total_weight = 0
    time = 0
    
    while bridge:
        total_weight -= bridge.popleft()
        time += 1
        
        if wait:
            if total_weight + wait[0] <= weight:
                bridge.append(wait[0])
                total_weight += wait.popleft()
            else:
                bridge.append(0)
    
    return time