class Solution {
    fun solution(name: String): Int {
        var leftRight = name.length - 1
        var upDown = 0

        name.forEachIndexed { idx, c ->
            var idxA = idx + 1

            while (idxA < name.length && name[idxA] == 'A') {
                idxA++
            }

            leftRight = minOf(leftRight, 2 * idx + name.length - idxA, idx + 2 * (name.length - idxA))
            upDown += minOf(c - 'A', 'Z' - c + 1)
        }

        return leftRight + upDown
    }
}