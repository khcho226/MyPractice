class Solution {
    lateinit var visited: BooleanArray
    var answer = 0
    
    fun solution(n: Int, computers: Array<IntArray>): Int {
        visited = BooleanArray(n)

        for (i in 0 until n) {
            if (visited[i].not()) {
                dfs(n, computers, i)
                answer++
            }
        }

        return answer
    }
    
    fun dfs(n: Int, computers: Array<IntArray>, i: Int) {
        visited[i] = true

        for (j in 0 until n) {
            if (visited[j].not() && computers[i][j] == 1) {
                dfs(n, computers, j)
            }
        }
    }
}