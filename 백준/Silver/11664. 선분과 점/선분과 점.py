import sys
import math

x1, y1, z1, x2, y2, z2, cx, cy, cz = map(float, sys.stdin.readline().split())
dis = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2 + (z2 - z1) ** 2)
dis1 = math.sqrt((cx - x1) ** 2 + (cy - y1) ** 2 + (cz - z1) ** 2)
dis2 = math.sqrt((cx - x2) ** 2 + (cy - y2) ** 2 + (cz - z2) ** 2)
left, right = 0, min(dis1, dis2)

while abs(right - left) > 0.000001:
    mid = (left + right) / 2
    dis3 = math.sqrt(dis1 * dis1 - mid * mid) + math.sqrt(dis2 * dis2 - mid * mid)

    if dis3 > dis:
        left = mid
    else:
        right = mid

print("%.10f" % mid)
