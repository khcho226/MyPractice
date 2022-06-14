import sys

a = str(sys.stdin.readline().strip())

print(bin(int(a, 8))[2:])