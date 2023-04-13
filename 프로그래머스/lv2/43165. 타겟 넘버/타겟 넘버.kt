class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return numbers.fold(listOf(0)) { list, num ->
            list.run {
                map { it + num } + map { it - num }
            }
        }.count { it == target }
    }
}