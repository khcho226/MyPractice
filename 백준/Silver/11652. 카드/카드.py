import sys

n = int(sys.stdin.readline())
dic = {}

for i in range(n):
    a = int(sys.stdin.readline())
    if a not in dic:
        dic[a] = 1
    else:
        dic[a] += 1

dic = sorted(dic.items(), key=lambda x: (-x[1], x[0]))
print(dic[0][0])
