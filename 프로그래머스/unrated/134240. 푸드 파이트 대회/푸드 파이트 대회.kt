class Solution {
    fun solution(food: IntArray): String {
        var half = ""
        
        for (idx in 1 until food.size) {
            half += idx.toString().repeat(food[idx] / 2)
        }      
        
        return half + "0" + half.reversed()
    }
}