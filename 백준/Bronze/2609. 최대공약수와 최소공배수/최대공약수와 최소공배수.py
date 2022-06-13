import sys

def GCD(a, b):
    while b:
        a, b = b, a % b

    return a

def LCM(a, b):
    return (a * b) // GCD(a, b)

a, b = map(int, sys.stdin.readline().split())

print(GCD(a, b))
print(LCM(a, b))