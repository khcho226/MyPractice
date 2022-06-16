import sys

n, c = map(int, sys.stdin.readline().split())
arr = [int(sys.stdin.readline()) for _ in range(n)]
arr.sort()
start, end = 1, arr[-1] - arr[0]

while start <= end:
    mid = (start + end) // 2
    cnt = 1
    install = arr[0]

    for i in range(1, len(arr)):
        if arr[i] >= mid + install:
            cnt += 1
            install = arr[i]

    if cnt >= c:
        start = mid + 1
        result = mid
    else:
        end = mid - 1

print(result)
