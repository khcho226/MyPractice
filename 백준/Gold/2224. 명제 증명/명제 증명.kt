fun main() = with(System.`in`.bufferedReader()) {
    val arr = Array(58) { BooleanArray(58) }
    val answer = StringBuilder()
    var row: Char
    var col: Char
    var cnt = 0

    repeat(readLine().toInt()) {
        readLine().also {
            row = it[0]
            col = it[5]
        }

        if (row != col && arr[row - 'A'][col - 'A'].not()) {
            arr[row - 'A'][col - 'A'] = true
            cnt++
        }
    }

    for (k in 0..57) {
        for (i in 0..57) {
            for (j in 0..57) {
                if (i != j && arr[i][k] && arr[k][j] && arr[i][j].not()) {
                    arr[i][j] = true
                    cnt++
                }
            }
        }
    }

    answer.append("${cnt}\n")

    for (i in 0..57) {
        for (j in 0..57) {
            if (arr[i][j]) {
                answer.append("${(i + 65).toChar()} => ${(j + 65).toChar()}\n")
            }
        }
    }

    print(answer)
}