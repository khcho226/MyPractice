import sys

n, m = map(int, sys.stdin.readline().split())
arr = [list(map(int, list(sys.stdin.readline().strip()))) for _ in range(n)]
arr2 = [list(map(int, list(sys.stdin.readline().strip()))) for _ in range(n)]

cnt = 0

for i in range(n - 2):
    for j in range(m - 2):
        if arr[i][j] != arr2[i][j]:
            cnt += 1
            for k in range(3):
                for l in range(3):
                    arr[i + k][j + l] = 1 - arr[i + k][j + l]

        if arr == arr2:
            break

    if arr == arr2:
        break

if arr != arr2:
    print(-1)
    
else:
    print(cnt)
