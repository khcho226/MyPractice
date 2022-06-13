import sys

nums = [True for i in range(1000001)]

for i in range(2, 1001):
    if nums[i]:
        for j in range(2 * i, 1000001, i):
            nums[j] = False

while True:
    a = int(sys.stdin.readline())

    if a == 0:
        break

    for i in range(2, 1000001):
        if nums[i] and nums[a - i]:
            print(a, "=", i, "+", a - i)
            break