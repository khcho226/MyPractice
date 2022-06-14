import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
dyn = [0] * (n + 1)
dyn[1] = nums[0]

for i in range(2, n + 1):
    mini = nums[i - 1]

    for j in range(1, i):
        mini = min(dyn[j] + nums[i - j - 1], mini)

    dyn[i] = mini

print(dyn[n])