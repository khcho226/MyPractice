import sys

n = int(sys.stdin.readline())
arr = []

for i in range(n):
    arr.append((int(sys.stdin.readline()), i))

arr2 = sorted(arr)
arr3 = []

for i in range(n):
    arr3.append(arr2[i][1] - arr[i][1])

print(max(arr3) + 1)
