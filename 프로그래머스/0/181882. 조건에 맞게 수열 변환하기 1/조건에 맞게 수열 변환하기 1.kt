class Solution {
    fun solution(arr: IntArray): IntArray {
        arr.forEachIndexed { idx, it ->
            if (it >= 50 && it % 2 == 0) {
                arr[idx] /= 2
            } else if (it < 50 && it % 2 == 1) {
                arr[idx] *= 2
            }
        }
        
        return arr
    }
}