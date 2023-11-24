import java.util.*

class Solution {
    var answer = 0

    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        val graph = Array(info.size) { arrayListOf<Int>() }
        val que: Queue<Int> = LinkedList()

        edges.forEach {
            graph[it[0]].add(it[1])
        }

        dfs(info, graph, 0, 0, 0,  que)
        return answer
    }

    fun dfs(info: IntArray, graph: Array<ArrayList<Int>>, node: Int, numS: Int, numW: Int, que: Queue<Int>) {
        val nNumS = numS - info[node] + 1
        val nNumW = numW + info[node]
        val nQue: Queue<Int> = LinkedList(que)

        if (nNumS <= nNumW) {
            return
        }

        answer = maxOf(answer, nNumS)

        graph[node].forEach {
            nQue.offer(it)
        }

        repeat(nQue.size) {
            val nNode = nQue.poll()

            dfs(info, graph, nNode, nNumS, nNumW, nQue)
            nQue.offer(nNode)
        }
    }
}