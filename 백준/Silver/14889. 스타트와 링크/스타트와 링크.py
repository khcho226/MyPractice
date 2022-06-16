import sys
from itertools import combinations

n = int(sys.stdin.readline())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
mem = [i for i in range(n)]
team = []
total = 0

for i in arr:
    total += sum(i)

for i in list(combinations(mem, n // 2)):
    team.append(i)

team2 = team[::-1]
slist = []
slist2 = []

for i in team:
    score = 0
    for j in range(len(i) - 1):
        for k in range(j + 1, len(i)):
            score += arr[i[j]][i[k]] + arr[i[k]][i[j]]
    slist.append(score)

for i in team2:
    score = 0
    for j in range(len(i) - 1):
        for k in range(j + 1, len(i)):
            score += arr[i[j]][i[k]] + arr[i[k]][i[j]]
    slist2.append(score)

mini = 100
for i in range(len(slist)):
    mini = min(abs(slist[i] - slist2[i]), mini)

print(mini)
