class Solution {
    var y = -1
    var x = 0
    
    fun solution(n: Int): IntArray {
        val arr = Array(n) { IntArray(it + 1) }
        var num = 1

        repeat(n) { i ->
            repeat(n - i) {
                moveCoordinate(i % 3)
                arr[y][x] = num++
            }
        }

        return arr.flatMap { it.asIterable() }.toIntArray()
    }
    
    fun moveCoordinate(n: Int) {
        when (n % 3) {
            0 -> y++
            1 -> x++
            else -> {
                y--
                x--
            }
        }
    }
}