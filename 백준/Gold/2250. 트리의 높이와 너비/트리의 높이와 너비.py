import sys
sys.setrecursionlimit(1000)

def inorder(root, depth):
    global rows
    if root != -1:
        inorder(tree[root][0], depth + 1)
        rows += 1
        arr[depth - 1].append(rows - 1)
        inorder(tree[root][1], depth + 1)

n = int(sys.stdin.readline())
arr = [[] for _ in range(n)]
node = [0] * n
tree = {}

for i in range(n):
    root, left, right = map(int, sys.stdin.readline().split())
    tree[root] = [left, right]
    node[root - 1] += 1

    if left != -1:
        node[left - 1] += 1
    if right != -1:
        node[right - 1] += 1

for i in range(n):
    if node[i] == 1:
        root = i + 1
        break

rows = 0
maximum = 0
inorder(root, 1)
result = 0

for i in range(1, n):
    if arr[i]:
        if max(arr[i]) - min(arr[i]) > maximum:
            maximum = max(arr[i]) - min(arr[i])
            result = i
print(result + 1, maximum + 1)