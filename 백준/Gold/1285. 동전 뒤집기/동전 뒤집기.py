import sys

n = int(sys.stdin.readline())
arr = [list(sys.stdin.readline().strip()) for _ in range(n)]
arr2 = [k[:] for k in arr]
ans = n ** 2

for i in range(n):
    for j in range(n):
        if arr2[i][j] == "H":
            arr2[i][j] = "T"
        else:
            arr2[i][j] = "H"

for bit in range(1 << n):
    temp = []
    for i in range(n):
        if bit & (1 << i):
            temp.append(arr2[i][:])
        else:
            temp.append(arr[i][:])

    total = 0
    for i in range(n):
        cnt = 0
        for j in range(n):
            if temp[j][i] == "T":
                cnt += 1
        total += min(cnt, n - cnt)
    ans = min(ans, total)

print(ans)
