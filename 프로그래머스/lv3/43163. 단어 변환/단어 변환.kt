import java.util.*

class Solution {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        val que: Queue<Pair<String, Int>> = LinkedList()
        val visited = BooleanArray(words.size)
        var answer = 0

        que.add(Pair(begin, 0))

        loop@ while (que.isNotEmpty()) {
            val (now, cnt) = que.poll()

            for (i in words.indices) {
                var temp = 0

                if (visited[i].not()) {
                    for (j in begin.indices) {
                        if (now[j] != words[i][j]) {
                            temp++
                        }
                    }
                }

                if (temp == 1) {
                    if (words[i] == target) {
                        answer = cnt + 1
                        break@loop
                    }

                    que.add(Pair(words[i], cnt + 1))
                    visited[i] = true
                }
            }
        }

        return answer
    }
}