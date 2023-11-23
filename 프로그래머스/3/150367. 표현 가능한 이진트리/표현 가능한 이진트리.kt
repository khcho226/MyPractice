class Solution {
    fun solution(numbers: LongArray): IntArray {
        val answer = IntArray(numbers.size)

        numbers.forEachIndexed { idx, it ->
            val num = it.toString(2)
            var len = 1

            while (num.length > len) {
                len = len * 2 + 1
            }

            if (dfs(num.padStart(len, '0'), len / 2, (len + 1) / 4)) {
                answer[idx] = 1
            }
        }

        return answer
    }

    fun dfs(num: String, idx: Int, depth: Int): Boolean {
        return if (depth == 0) {
            true
        } else if (num[idx] == '0' && (num[idx - depth] == '1' || num[idx + depth] == '1')) {
            false
        } else {
            dfs(num, idx - depth, depth / 2) && dfs(num, idx + depth, depth / 2)
        }
    }
}