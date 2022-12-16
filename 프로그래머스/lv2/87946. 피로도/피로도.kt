class Solution {
    var ans = 0
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        backtracking(k, dungeons, BooleanArray(dungeons.size) { false }, 0)
        
        return ans
    }
    
    fun backtracking(k: Int, dungeons: Array<IntArray>, visited: BooleanArray, cnt: Int) {
        if (cnt > ans) {
            ans = cnt
        }
        
        dungeons.forEachIndexed { idx, it ->
            if (visited[idx] == false && k >= it[0]) {
                visited[idx] = true
                backtracking(k - it[1], dungeons, visited, cnt + 1)
                visited[idx] = false
            }
        }
    }
}