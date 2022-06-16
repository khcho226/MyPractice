import sys

n, m = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().strip())) for _ in range(n)]
_max = 0

for i in range(1 << n * m):
    total = 0

    for row in range(n):
        row_sum = 0
        for col in range(m):
            idx = row * m + col
            if i & (1 << idx) != 0:
                row_sum = row_sum * 10 + arr[row][col]
            else:
                total += row_sum
                row_sum = 0
        total += row_sum

    for col in range(m):
        col_sum = 0
        for row in range(n):
            idx = row * m + col
            if i & (1 << idx) == 0:
                col_sum = col_sum * 10 + arr[row][col]
            else:
                total += col_sum
                col_sum = 0
        total += col_sum

    _max = max(_max, total)

print(_max)
