import sys
import math

x, y, c = map(float, sys.stdin.readline().split())
left, right = 0, min(x, y)

while abs(right - left) > 0.001:
    mid = (left + right) / 2
    h1 = math.sqrt(x * x - mid * mid)
    h2 = math.sqrt(y * y - mid * mid)
    h = (h1 * h2) / (h1 + h2)

    if h > c:
        left = mid
    else:
        right = mid

print("%.3f"%round(mid, 3))
