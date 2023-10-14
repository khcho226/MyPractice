import copy

def solution(game_board, table):
    n = len(game_board)
    blocks = []
    answer = 0

    for i in range(n):
        for j in range(n):
            if game_board[i][j] == 0:
                blocks.append(dfs(game_board, i, j, 0, 0, n, 0))

    for _ in range(4):
        table = list(map(list, zip(*table[::-1])))
        copy_table = copy.deepcopy(table)

        for i in range(n):
            for j in range(n):
                if copy_table[i][j] == 1:
                    block = dfs(copy_table, i, j, 0, 0, n, 1)
                    
                    if block in blocks:
                        blocks.remove(block)
                        answer += len(block)
                        table = copy.deepcopy(copy_table)
                    else:
                        copy_table = copy.deepcopy(table)

    return answer

def dfs(board, x, y, px, py, n, num):
    board[x][y] = 2
    block = [(px, py)]
    d = [(1, 0), (0, 1), (-1, 0), (0, -1)]

    for i in range(4):
        nx, ny = x + d[i][0], y + d[i][1]

        if 0 <= nx < n and 0 <= ny < n:
            if board[nx][ny] == num:
                block += dfs(board, nx, ny, px + d[i][0], py + d[i][1], n, num)

    return block