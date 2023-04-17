class Solution {
    val list = mutableListOf<Int>()
    lateinit var nums: IntArray
    var depth = 3
    var answer = 0

    fun solution(number: IntArray): Int {
        nums = number
        combination(0, 0)

        return answer
    }

    fun combination(cnt: Int, idx: Int) {
        if (cnt == depth) {
            if (list.sum() == 0) {
                answer++
            }
            
            return
        }

        for (i in idx until nums.size) {
            list.add(nums[i])
            combination(cnt + 1, i + 1)
            list.removeLast()
        }
    }
}