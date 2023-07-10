class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val sum = number.sum()
        val nums = IntArray(want.size)
        var answer = 0

        for (i in 0 until (sum - 1)) {
            want.indexOf(discount[i]).also {
                if (it != -1) {
                    nums[it]++
                }
            }
        }

        for (i in (sum - 1) until discount.size) {
            want.indexOf(discount[i]).also {
                if (it != -1) {
                    nums[it]++
                }
            }

            if (nums.contentEquals(number)) {
                answer++
            }

            want.indexOf(discount[i - sum + 1]).also {
                if (it != -1) {
                    nums[it]--
                }
            }
        }

        return answer
    }
}