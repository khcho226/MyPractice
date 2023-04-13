class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val lostStudent = lost.sorted().filter { reserve.contains(it).not() }.toMutableList()

        reserve.filter { lost.contains(it).not() }.sorted().forEach {
            if (lostStudent.contains(it - 1)) {
                lostStudent.remove(it - 1)
            } else if (lostStudent.contains(it + 1)) {
                lostStudent.remove(it + 1)
            }
        }

        return n - lostStudent.size
    }
}