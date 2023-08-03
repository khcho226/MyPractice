private lateinit var lst: List<Int>
var cnt = 0

fun main(): Unit = with(System.`in`.bufferedReader()) {
    lst = readLine().split(" ").map { it.toInt() }

    for (i in 1..5) {
        dfs(1, 1, i.check(lst[0]), i)
    }

    print(cnt)
}

fun dfs(row: Int, depth: Int, score: Int, last: Int) {
    if (row == 3) {
        return
    }

    if (depth == 10) {
        if (score >= 5) {
            cnt++
        }

        return
    }

    for (i in 1..5) {
        dfs(
            if (i == last) {
                row + 1
            } else {
                1
            }, depth + 1, score + i.check(lst[depth]), i
        )
    }
}

fun Int.check(input: Int) = if (this == input) {
    1
} else {
    0
}