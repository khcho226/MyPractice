class Solution {
    fun solution(n: Int): IntArray {
        val arr = arrayListOf(n)
        var num = n

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2
            } else {
                num = num * 3 + 1
            }
            
            arr.add(num)
        }
        
        return arr.toIntArray()
    }
}