import sys

n = int(sys.stdin.readline())
s = set()

for i in range(n):
    arr = sys.stdin.readline().strip().split()
    a = arr[0]

    if len(arr) == 1:
        if a == "all":
            s = set([i for i in range(1, 21)])

        else:
            s = set()

    else:
        b = int(arr[1])

        if a == "add":
            s.add(b)

        elif a == "remove":
            s.discard(b)

        elif a == "check":
            print(1 if b in s else 0)

        else:
            if b in s:
                s.discard(b)
            else:
                s.add(b)
