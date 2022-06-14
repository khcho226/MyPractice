import sys

def GCD(a, b):
    while b:
        a, b = b, a % b

    return a

n, s = map(int, sys.stdin.readline().split())
nums = list(map(int, sys.stdin.readline().split()))

for i in range(n):
    nums[i] = abs(s - nums[i])

if n > 1:
    gcd = GCD(nums[0], nums[1])

    for i in range(2, n):
        gcd = GCD(gcd, nums[i])

else:
    gcd = nums[0]

print(gcd)