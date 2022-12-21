class Solution {
    fun solution(s: String): IntArray {
        val arr = IntArray(26) { -1 }
        var answer: IntArray = intArrayOf()
        
        s.forEachIndexed { idx, it ->
            answer = if (arr[it - 'a'] == -1) {
                answer.plus(-1)
            } else {
                answer.plus(idx - arr[it - 'a'])
            }
            arr[it - 'a'] = idx
        }
        
        return answer
    }
}