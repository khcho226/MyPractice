class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = arrayListOf<Int>()
        
        for (i in arr) {
            repeat(i) {
                answer.add(i)
            }
        }

        return answer.toIntArray()
    }
}