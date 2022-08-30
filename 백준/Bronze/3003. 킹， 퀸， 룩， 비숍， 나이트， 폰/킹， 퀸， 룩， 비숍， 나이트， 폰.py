import sys

nums = list(map(int, sys.stdin.readline().split()))
lst = [1, 1, 2, 2, 2, 8]

for i in range(len(nums)):
    print(lst[i] - nums[i], end=" ")
