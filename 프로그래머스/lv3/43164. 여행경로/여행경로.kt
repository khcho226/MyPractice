class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val map = tickets.groupBy { it.first() }.mapValues { it.value.flatMap { it.drop(1) }.sortedDescending().toMutableList() }
        val arr = arrayListOf("ICN")
        val answer = arrayListOf<String>()

        while (arr.isNotEmpty()) {
            val target = arr.last()

            if (map.containsKey(target).not() || map[target]!!.isEmpty()) {
                answer.add(arr.removeLast())
            } else {
                arr.add(map[target]!!.removeLast())
            }
        }

        return answer.reversed().toTypedArray()
    }
}