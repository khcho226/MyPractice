import heapq

def solution(operations):
    answer = []
    heap = []
    
    for i in operations:
        a, b = i.split(" ")
        
        if a == "I":
            heapq.heappush(heap, int(b))
        else:
            if heap:
                if b == "1":
                    heap = heapq.nlargest(len(heap), heap)[1:]
                    heapq.heapify(heap)
                else:
                    heapq.heappop(heap)
        
    if not heap:
        heap = [0]
    
    return [max(heap), min(heap)]