import sys

a = int(sys.stdin.readline())
n = []
max = 0

for i in range(a):
    b = int(sys.stdin.readline())
    n.append(b)

    if max < b:
        max = b

nums = [True for i in range(max + 1)]
nums[1] = False

for i in range(2, int(max ** 0.5) + 1):
    if nums[i]:
        for j in range(2 * i, max + 1, i):
            nums[j] = False

for i in n:
    cnt = 0
    nums2 = nums.copy()

    for j in range(2, i // 2 + 1):
        if nums2[j] and nums2[i - j]:
            cnt += 1

    print(cnt)