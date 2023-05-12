import heapq
from collections import deque

def solution(jobs):
    job = deque(sorted([(x[1], x[0]) for x in jobs], key=lambda x: (x[1], x[0])))
    h = []
    heapq.heappush(h, job.popleft())
    now, total = 0, 0

    while h:
        end, start = heapq.heappop(h)
        now = max(now + end, start + end)
        total += now - start
        
        while job and job[0][1] <= now:
            heapq.heappush(h, job.popleft())
    
        if job and not h:
            heapq.heappush(h, job.popleft())
            
    return total // len(jobs)