class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val map = mutableMapOf<Char, Int>()
        var answer = intArrayOf()

        keymap.forEach { key ->
            key.forEachIndexed { idx, it ->
                if (map.containsKey(it)) {
                    map[it] = minOf(map[it]!!, idx + 1)
                } else {
                    map[it] = idx + 1
                }
            }
        }

        targets.forEach { target ->
            var cnt = 0
            var flag = false

            for (i in target.indices) {
                if (map.containsKey(target[i])) {
                    cnt += map[target[i]]!!
                } else {
                    flag = true
                    break
                }
            }

            if (flag) {
                cnt = -1
            }

            answer = answer.plus(cnt)
        }

        return answer
    }
}