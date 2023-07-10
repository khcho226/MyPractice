class Solution {
    lateinit var nums: IntArray

    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val sum = number.sum()
        var answer = 0

        nums = IntArray(want.size)

        for (i in 0 until (sum - 1)) {
            rearrangeNums(want.indexOf(discount[i]), 1)
        }

        for (i in (sum - 1) until discount.size) {
            rearrangeNums(want.indexOf(discount[i]), 1)

            if (nums.contentEquals(number)) {
                answer++
            }

            rearrangeNums(want.indexOf(discount[i - sum + 1]), -1)
        }

        return answer
    }

    fun rearrangeNums(idx: Int, n: Int) {
        if (idx != -1) {
            nums[idx] += n
        }
    }
}