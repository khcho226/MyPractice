class Solution {
    fun solution(n: Int, results: Array<IntArray>): Int {
        val arr = MutableList(n) { IntArray(n) }
        
        results.forEach {
            arr[it[0] - 1][it[1] - 1] = 1
            arr[it[1] - 1][it[0] - 1] = -1
        }
        
        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (i != j && arr[i][j] == 0 && arr[i][k] == 1 && arr[k][j] == 1) {
                        arr[i][j] = 1
                        arr[j][i] = -1
                        arr[j][k] = -1
                        arr[k][i] = -1
                    }
                }
            }
        }
        
        return arr.count { it.count { it == 0 } == 1 }
    }
}