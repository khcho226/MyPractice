import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
dyn = [0 for i in range(n)]
dyn[0] = nums[0]

for i in range(1, n):
    dyn[i] = max(nums[i], dyn[i - 1] + nums[i])

print(max(dyn))