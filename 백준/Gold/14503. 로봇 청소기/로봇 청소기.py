n, m = map(int, input().split())
r, c, d = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

arr[r][c] = 2
dir_arr = [(-1, 0), (0, 1), (1, 0), (0, -1)]
cnt = 1

while True:
    flag = True

    for _ in range(4):
        d = (d + 3) % 4
        nr, nc = r + dir_arr[d][0], c + dir_arr[d][1]

        if 0 <= nr < n and 0 <= nc < m and arr[nr][nc] == 0:
            r, c = nr, nc
            arr[r][c] = 2
            cnt += 1
            flag = False
            break

    if flag:
        if arr[r - dir_arr[d][0]][c - dir_arr[d][1]] == 1:
            print(cnt)
            break
        else:
            r, c = r - dir_arr[d][0], c - dir_arr[d][1]