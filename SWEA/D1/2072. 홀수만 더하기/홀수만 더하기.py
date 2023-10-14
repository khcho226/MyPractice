T = int(input())

for test_case in range(1, T + 1):
    nums = map(int, input().split())
    total = 0

    for x in nums:
        if x % 2 == 1:
            total += x

    print(f"#{test_case} {total}")
