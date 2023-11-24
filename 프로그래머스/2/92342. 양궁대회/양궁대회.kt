class Solution {
    var maxLst = intArrayOf()
    var maxDiff = 0

    fun solution(n: Int, info: IntArray): IntArray {
        dfs(n, info, 0, 0, 0, 0, IntArray(11))

        return if (maxLst.isNotEmpty()) {
            maxLst
        } else {
            intArrayOf(-1)
        }
    }

    fun dfs(n: Int, info: IntArray, lScore: Int, aScore: Int, cnt: Int, idx: Int, lst: IntArray) {
        if (idx > 10) {
            (lScore - aScore).also {
                if (it > maxDiff) {
                    lst[10] = n - cnt
                    maxLst = lst
                    maxDiff = it
                }
            }

            return
        }

        if (cnt + info[10 - idx] + 1 <= n) {
            val temp = lst.copyOf().also {
                it[10 - idx] = info[10 - idx] + 1
            }

            dfs(n, info, lScore + idx, aScore, cnt + info[10 - idx] + 1, idx + 1, temp)
        }

        if (info[10 - idx] > 0) {
            dfs(n, info, lScore, aScore + idx, cnt, idx + 1, lst)
        } else {
            dfs(n, info, lScore, aScore, cnt, idx + 1, lst)
        }
    }
}