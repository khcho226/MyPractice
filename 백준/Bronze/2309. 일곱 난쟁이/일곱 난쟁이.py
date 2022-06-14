import sys

nums = []

for i in range(9):
    nums.append(int(sys.stdin.readline()))

total = sum(nums)
cnt = 0

for i in range(8):
    if cnt == 1:
        break

    for j in range(i + 1, 9):
        if nums[i] + nums[j] == total - 100:
            nums.remove(nums[i])
            nums.remove(nums[j - 1])
            cnt = 1
            break

for i in sorted(nums):
    print(i)