import sys

a = str(sys.stdin.readline().strip())
nums = ["000", "001", "010", "011", "100", "101", "110", "111"]

if len(a) % 3 == 2:
    a = "0" + a

elif len(a) % 3 == 1:
    a = "00" + a

for i in range(len(a) // 3):
    b = a[3 * i : 3 * i + 3]
    print(nums.index(b), end = "")