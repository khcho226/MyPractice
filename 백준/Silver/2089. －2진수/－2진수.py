import sys

a = int(sys.stdin.readline().strip())
nums = []

while a != 1 and a != 0:
    if a % 2 == 0:
        a = a // -2
        nums.append(0)

    else:
        a = (a - 1) // -2
        nums.append(1)

nums.append(a)

for i in reversed(nums):
    print(i, end = "")