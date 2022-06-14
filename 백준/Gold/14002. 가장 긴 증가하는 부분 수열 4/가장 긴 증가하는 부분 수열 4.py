import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
dyn = [0 for i in range(n)]
dyn[0] = 1

for i in range(1, n):
    maxi = 0

    for j in range(i - 1, -1, -1):
        if nums[j] < nums[i]:
            maxi = max(maxi, dyn[j])

    dyn[i] = maxi + 1

maxi = max(dyn)
a = dyn.index(maxi)
stack = []

print(maxi)

for i in range(a, -1, -1):
    if dyn[i] == maxi:
        stack.append(nums[a])
        maxi -= 1

        if maxi == 0:
            break

    a -= 1

print(*reversed(stack))