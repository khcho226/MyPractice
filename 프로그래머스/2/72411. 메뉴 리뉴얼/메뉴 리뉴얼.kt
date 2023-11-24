class Solution {
    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        val arr = Array(21) { arrayListOf<String>() }
        val answer = arrayListOf<String>()

        orders.map { it.toCharArray().sorted().joinToString("") }.forEach { order ->
            course.forEach {
                dfs(order, it, 0, 0, "", arr)
            }
        }

        arr.filter { it.isNotEmpty() }.map {
            it.groupingBy { it }
                .eachCount().entries
                .sortedByDescending { it.value }
        }.also {
            for (i in it.indices) {
                val num = it[i][0].value

                if (num < 2) {
                    break
                }
                
                for (j in it[i].indices) {
                    if (it[i][j].value != num) {
                        break
                    }

                    answer.add(it[i][j].key)
                }
            }
        }

        return answer.sorted().toTypedArray()
    }
    
    fun dfs(order: String, c: Int, idx: Int, cnt: Int, s: String, arr: Array<ArrayList<String>>) {
        if (c == cnt) {
            arr[c].add(s)
            return
        }

        for (i in idx until order.length) {
            dfs(order, c, i + 1, cnt + 1, s + order[i], arr)
        }
    }
}