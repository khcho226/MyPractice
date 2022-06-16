import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().strip()))
arr2 = arr.copy()
arr2[0] = 1 - arr2[0]
arr2[1] = 1 - arr2[1]
goal = list(map(int, sys.stdin.readline().strip()))

cnt = 0
for i in range(1, n):
    if arr[i - 1] != goal[i - 1]:
        cnt += 1
        arr[i - 1] = 1 - arr[i - 1]
        arr[i] = 1 - arr[i]
        if i != n - 1:
            arr[i + 1] = 1 - arr[i + 1]

if arr == goal:
    print(cnt)

else:
    cnt = 1
    for i in range(1, n):
        if arr2[i - 1] != goal[i - 1]:
            cnt += 1
            arr2[i - 1] = 1 - arr2[i - 1]
            arr2[i] = 1 - arr2[i]
            if i != n - 1:
                arr2[i + 1] = 1 - arr2[i + 1]

    if arr2 == goal:
        print(cnt)

    else:
        print(-1)