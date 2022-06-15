import sys
sys.setrecursionlimit(10 ** 6)

k = int(sys.stdin.readline())

def dfs(start, num):
    global error

    if error:
        return

    visited[start] = num

    for n in graph[start]:
        if not visited[n]:
            dfs(n, -num)

        elif visited[n] == num:
            error = True
            return

for i in range(k):
    v, e = map(int, sys.stdin.readline().split())
    graph = [[] for j in range(v + 1)]
    visited = [False] * (v + 1)
    error = False

    for j in range(e):
        a, b = map(int, sys.stdin.readline().split())
        graph[a].append(b)
        graph[b].append(a)

    for j in range(1, v + 1):
        if not visited[j]:
            dfs(j, 1)

            if error:
                break

    if not error:
        print("YES")

    else:
        print("NO")