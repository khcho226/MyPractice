class Solution {
    fun solution(elements: IntArray): Int {
        val nums = mutableSetOf<Int>()
        val arr = elements + elements
        
        for (i in elements.indices) {
            for (j in elements.indices) {
                nums.add(arr.slice(i..(i + j)).sum())
            }
        }

        return nums.size
    }
}