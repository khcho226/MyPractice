import sys
import heapq

n, k = map(int, sys.stdin.readline().split())
jewel = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
jewel.sort()
bag = [int(sys.stdin.readline()) for _ in range(k)]
bag.sort()

total = 0
temp = []

for i in bag:
    while jewel and i >= jewel[0][0]:
        heapq.heappush(temp, -jewel[0][1])
        heapq.heappop(jewel)

    if temp:
        total += heapq.heappop(temp)

    elif not jewel:
        break

print(-total)
