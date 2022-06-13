import sys

def GCD(a, b):
    while b:
        a, b = b, a % b

    return a

def LCM(a, b):
    return (a * b) // GCD(a, b)

n = int(sys.stdin.readline())

for i in range(n):
    a, b = map(int, sys.stdin.readline().split())

    print(LCM(a, b))