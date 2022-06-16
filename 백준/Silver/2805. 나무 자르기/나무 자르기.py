import sys

n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
start, end = 1, max(arr) - 1

while start <= end:
    mid = (start + end) // 2
    cnt = 0
    for i in arr:
        if i > mid:
            cnt += i - mid

    if cnt >= m:
        start = mid + 1
    else:
        end = mid - 1

print(end)
