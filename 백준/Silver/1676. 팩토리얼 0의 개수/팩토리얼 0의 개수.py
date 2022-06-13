import sys

def factorial(x, y):
    if x > 1:
        return factorial(x - 1, x * y)

    else:
        return y

a = int(sys.stdin.readline())
b = factorial(a, 1)
cnt = 0

for i in range(len(str(b))):
    if str(b)[len(str(b)) - 1 - i] == "0":
        cnt += 1

    else:
        print(cnt)
        break