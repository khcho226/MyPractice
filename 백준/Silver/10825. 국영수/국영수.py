import sys

n = int(sys.stdin.readline())
score = [[] for _ in range(n)]

for i in range(n):
    score[i] = sys.stdin.readline().strip().split()

score.sort(key=lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))

for i in range(n):
    print(score[i][0])
