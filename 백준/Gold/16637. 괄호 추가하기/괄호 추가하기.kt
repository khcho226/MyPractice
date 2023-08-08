var n = 0
var line = ""
var max = Int.MIN_VALUE

fun main() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    line = readLine()
    dfs(0, line[0] - '0')
    print(max)
}

fun dfs(idx: Int, value: Int) {
    if (idx == n - 1) {
        max = maxOf(max, value)
        return
    }

    if (idx < n - 2) {
        dfs(idx + 2, calc(value, line[idx + 1], line[idx + 2] - '0'))
    }

    if (idx < n - 4) {
        dfs(idx + 4, calc(value, line[idx + 1], calc(line[idx + 2] - '0', line[idx + 3], line[idx + 4] - '0')))
    }
}

fun calc(num1: Int, op: Char, num2: Int): Int {
    return when (op) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        else -> num1 * num2
    }
}