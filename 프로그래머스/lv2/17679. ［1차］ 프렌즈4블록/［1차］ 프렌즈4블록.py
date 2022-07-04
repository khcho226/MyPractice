import copy

def solution(m, n, board):
    board = [list(x) for x in board]
    
    while True:    
        arr = copy.deepcopy(board)
        check = True
        
        for i in range(m - 1):
            for j in range(n - 1):
                if arr[i][j] != 0 and arr[i][j] == arr[i + 1][j] == arr[i][j + 1] == arr[i + 1][j + 1]:
                    board[i][j] = board[i + 1][j] = board[i][j + 1] = board[i + 1][j + 1] = 0
                    check = False
        
        if check:
            num = 0
            
            for i in board:
                num += i.count(0)
            
            return num
        
        else:
            for i in range(m - 1):
                for j in range(n):
                    if board[m - i - 2][j] != 0 and board[m - i - 1][j] == 0:
                        num = -1
                        
                        while True:
                            num += 1
                            
                            if num >= i + 1 or board[m - i - 1 + num][j] != 0:
                                break
                            
                        board[m - i - 2 + num][j] = board[m - i - 2][j]
                        board[m - i - 2][j] = 0