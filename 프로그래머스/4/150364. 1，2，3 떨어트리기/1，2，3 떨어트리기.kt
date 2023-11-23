class Solution {
    fun solution(edges: Array<IntArray>, target: IntArray): IntArray {
        val n = edges.size + 2
        val arr = Array(n) { arrayListOf<Int>() }
        val pass = IntArray(n)
        val cnt = IntArray(n)
        val visited = BooleanArray(n)
        val seq = arrayListOf<Int>()
        val answer = arrayListOf<Int>()
        var case = target.count { it != 0 }

        edges.forEach {
            arr[it[0]].add(it[1])
        }

        arr.forEach {
            if (it.isNotEmpty()) {
                it.sort()
            }
        }

        while (case > 0) {
            var node = 1

            while (arr[node].isNotEmpty()) {
                node = arr[node][pass[node]++ % arr[node].size]
            }

            if (++cnt[node] > target[node - 1]) {
                return intArrayOf(-1)
            } else if (visited[node].not() && cnt[node] * 3 >= target[node - 1]) {
                visited[node] = true
                case--
            }

            seq.add(node)
        }

        seq.forEach {
            cnt[it]--

            for (num in 1..3) {
                if (cnt[it] <= target[it - 1] - num && target[it - 1] - num <= cnt[it] * 3) {
                    target[it - 1] -= num
                    answer.add(num)
                    break
                }
            }
        }

        return answer.toIntArray()
    }
}