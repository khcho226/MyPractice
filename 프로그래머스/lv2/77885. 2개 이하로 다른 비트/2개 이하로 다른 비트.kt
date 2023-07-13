class Solution {
    fun solution(numbers: LongArray): LongArray {
        return numbers.map {
            if (it % 2 == 0L) {
                it + 1
            } else {
                val bit = "0" + it.toString(2)
                val idx = bit.lastIndexOf("01")

                bit.replaceRange(idx, idx + 2, "10").toLong(2)
            }
        }.toLongArray()
    }
}