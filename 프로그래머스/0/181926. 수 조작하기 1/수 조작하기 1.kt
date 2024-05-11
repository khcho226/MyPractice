class Solution {
    fun solution(n: Int, control: String): Int {
        var num = n
        
        control.forEach {
            when (it) {
                'w' -> num += 1
                's' -> num -= 1
                'd' -> num += 10
                else -> num -= 10
            }
        }
        
        return num
    }
}