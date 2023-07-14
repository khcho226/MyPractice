class Solution {
    fun solution(n: Int): IntArray {
        val arr = Array(n) { IntArray(it + 1) }
        var y = -1
        var x = 0
        var num = 1

        for (i in 0 until n) {
            repeat(n - i) {
                when (i % 3) {
                    0 -> y++
                    1 -> x++
                    else -> {
                        y--
                        x--
                    }
                }

                arr[y][x] = num++
            }
        }

        return arr.flatMap { it.asIterable() }.toIntArray()
    }
}