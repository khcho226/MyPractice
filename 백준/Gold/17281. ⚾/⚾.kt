import java.util.*

lateinit var player: Array<IntArray>
val visited = BooleanArray(9)
val order = Array(9) { 0 }.also { it[3] = 0 }
var maxScore = 0

fun main() = with(System.`in`.bufferedReader()) {
    var token: StringTokenizer

    player = Array(readLine().toInt()) {
        token = StringTokenizer(readLine())
        IntArray(9) { token.nextToken().toInt() }
    }

    getOrder(0)
    println(maxScore)
}

fun getOrder(depth: Int) {
    when (depth) {
        3 -> getOrder(depth + 1)
        9 -> play()
        else -> {
            for (i in 1..8) {
                if (visited[i].not()) {
                    visited[i] = true
                    order[depth] = i
                    getOrder(depth + 1)
                    visited[i] = false
                }
            }
        }
    }
}

fun play() {
    var score = 0
    var idx = 0

    player.forEach {
        var out = 0
        var base = IntArray(3)

        while (out < 3) {
            when (it[order[idx]]) {
                0 -> out++
                1 -> {
                    score += base[2]
                    base = intArrayOf(1, base[0], base[1])
                }
                2 -> {
                    score += base[1] + base[2]
                    base = intArrayOf(0, 1, base[0])
                }
                3 -> {
                    score += base.sum()
                    base = intArrayOf(0, 0, 1)
                }
                4 -> {
                    score += base.sum() + 1
                    base = intArrayOf(0, 0, 0)
                }
            }

            idx = (idx + 1) % 9
        }
    }

    maxScore = maxScore.coerceAtLeast(score)
}