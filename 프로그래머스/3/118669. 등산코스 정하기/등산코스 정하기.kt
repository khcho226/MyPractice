import java.util.*

class Solution {
    fun solution(n: Int, paths: Array<IntArray>, gates: IntArray, summits: IntArray): IntArray {
        val graph = Array(n + 1) { arrayListOf<Pair<Int, Int>>() }
        val que = PriorityQueue<Pair<Int, Int>> { a, b -> a.second - b.second }
        val visited = IntArray(n + 1) { 10000001 }
        val answer = intArrayOf(0, 10000001)

        paths.forEach {
            graph[it[0]].add(Pair(it[1], it[2]))
            graph[it[1]].add(Pair(it[0], it[2]))
        }

        gates.forEach {
            que.offer(Pair(it, 0))
            visited[it] = 0
        }

        while (que.isNotEmpty()) {
            val (node, intensity) = que.poll()

            if (summits.contains(node) || visited[node] < intensity) {
                continue
            }

            graph[node].forEach {
                val newIntensity = maxOf(intensity, it.second)

                if (visited[it.first] > newIntensity) {
                    visited[it.first] = newIntensity
                    que.offer(Pair(it.first, newIntensity))
                }
            }
        }

        summits.sorted().forEach {
            if (answer[1] > visited[it]) {
                answer[0] = it
                answer[1] = visited[it]
            }
        }

        return answer
    }
}