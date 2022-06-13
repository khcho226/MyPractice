import sys

def divide(x, y):
    cnt = 0

    while x > 1:
        x = x // y
        cnt += x

    return cnt

a, b = map(int, sys.stdin.readline().split())

print(min(divide(a, 2) - divide(a - b, 2) - divide(b, 2), divide(a, 5) - divide(a - b, 5) - divide(b, 5)))