import sys

n = int(sys.stdin.readline())
arr = [[] for _ in range(n)]

for i in range(n):
    a, b = map(int, sys.stdin.readline().split())
    arr[i].append(a)
    arr[i].append(b)

arr.sort(key=lambda x: (x[1], x[0]))
cnt = 1
end = arr[0][1]

for i in range(1, n):
    if arr[i][0] >= end:
        end = arr[i][1]
        cnt += 1

print(cnt)