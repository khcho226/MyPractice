class Solution {
    fun solution(elements: IntArray): Int {
        val nums = mutableSetOf<Int>()
        val arr = elements.plus(elements).dropLast(1)
        
        for (i in elements.indices) {
            for (j in elements.indices) {
                nums.add(arr.slice(i..(i + j)).sum())
            }
        }

        return nums.size
    }
}