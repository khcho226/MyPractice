import java.util.*

class Solution {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        val visited = IntArray(n + 1) { -1 }
        val que: Queue<Pair<Int, Int>> = LinkedList()
        val graph = MutableList(n + 1) { arrayListOf<Int>() }

        visited[1] = 0
        que.add(Pair(1, 0))
        edge.forEach {
            graph[it[0]].add(it[1])
            graph[it[1]].add(it[0])
        }

        while (que.isNotEmpty()) {
            val (node, cnt) = que.poll()

            graph[node].forEach {
                if (visited[it] == -1) {
                    visited[it] = cnt + 1
                    que.add(Pair(it, cnt + 1))
                }
            }
        }
    
        return visited.count { it == visited.maxOrNull() }
    }
}