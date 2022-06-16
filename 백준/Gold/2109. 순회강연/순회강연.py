import sys
import heapq

n = int(sys.stdin.readline())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
arr.sort(key=lambda x: x[1])

lst = []
for i in arr:
    heapq.heappush(lst, i[0])
    if len(lst) > i[1]:
        heapq.heappop(lst)

print(sum(lst))
