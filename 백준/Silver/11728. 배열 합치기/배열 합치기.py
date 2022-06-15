import sys

n, m = map(int, sys.stdin.readline().split())
nlist = list(map(int, sys.stdin.readline().split()))
mlist = list(map(int, sys.stdin.readline().split()))
dic = {}

for i in nlist:
    if i not in dic:
        dic[i] = 1
    else:
        dic[i] += 1

for i in mlist:
    if i not in dic:
        dic[i] = 1
    else:
        dic[i] += 1

dic = dict(sorted(dic.items()))
for i in dic:
    for j in range(dic[i]):
        print(i, end = " ")