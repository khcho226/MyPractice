class Solution {
    fun solution(ingredient: IntArray): Int {
        val stack = arrayListOf<Int>()
        var answer = 0

        ingredient.forEach {
            stack.add(it)
            
            if (stack.size >= 4 && stack.takeLast(4).joinToString("") == "1231") {
                repeat(4) { stack.removeLast() }
                answer++
            }
        }

        return answer
    }
}