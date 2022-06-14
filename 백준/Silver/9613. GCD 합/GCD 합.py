import sys

def GCD(a, b):
    while b:
        a, b = b, a % b

    return a

n = int(sys.stdin.readline())

for i in range(n):
    nums = list(map(int, sys.stdin.readline().split()))
    sum = 0

    for j in range(1, nums[0]):
        for k in range(j + 1, nums[0] + 1):
            sum += GCD(nums[j], nums[k])

    print(sum)