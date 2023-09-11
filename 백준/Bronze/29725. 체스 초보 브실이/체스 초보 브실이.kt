fun main() = with(System.`in`.bufferedReader()) {
    var score = 0
    
    repeat(8) {
        readLine().forEach {
            score += getScore(it)
        }
    }

    print(score)
}

fun getScore(input: Char): Int {
    return when (input) {
        'P' -> 1
        'p' -> -1
        'N' -> 3
        'n' -> -3
        'B' -> 3
        'b' -> -3
        'R' -> 5
        'r' -> -5
        'Q' -> 9
        'q' -> -9
        else -> 0
    }
}