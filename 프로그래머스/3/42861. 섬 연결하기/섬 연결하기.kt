class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        val arr = costs.sortedBy { it[2] }
        val set = mutableSetOf(arr[0][0])
        var cost = 0

        while (set.size != n) {
            run breaking@ {
                arr.forEach {
                    if ((set.contains(it[0]) && !set.contains(it[1])) || (!set.contains(it[0]) && set.contains(it[1]))) {
                        cost += it[2]
                        set.addAll(it.dropLast(1))
                        return@breaking
                    }
                }
            }
        }

        return cost
    }
}