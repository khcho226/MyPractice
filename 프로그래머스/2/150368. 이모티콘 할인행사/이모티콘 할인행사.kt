class Solution {
    val salesArr = arrayListOf<Int>()
    val sales = arrayOf(10, 20, 30, 40)
    val answer = arrayListOf<Pair<Int, Int>>()

    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        dfs(users, emoticons, emoticons.size)
        return answer.sortedWith(compareBy({ it.first }, { it.second })).last().toList().toIntArray()
    }

    fun dfs(users: Array<IntArray>, emoticons: IntArray, depth: Int) {
        if (depth == 0) {
            calc(users, emoticons)
            return
        }

        repeat(4) {
            salesArr.add(sales[it])
            dfs(users, emoticons, depth - 1)
            salesArr.removeLast()
        }
    }

    fun calc(users: Array<IntArray>, emoticons: IntArray) {
        var plus = 0
        var total = 0

        users.forEach { user ->
            var temp = 0

            emoticons.forEachIndexed { idx, emo ->
                salesArr[idx].also {
                    if (it >= user[0]) {
                        temp += (100 - it) * emo / 100
                    }
                }
            }

            if (temp >= user[1]) {
                plus++
            } else {
                total += temp
            }
        }

        answer.add(Pair(plus, total))
    }
}