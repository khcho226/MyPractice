class Solution {
    fun solution(N: Int, number: Int): Int {
        val dp = arrayListOf<MutableSet<Int>>()

        for (i in 1..8) {
            val case = mutableSetOf(N.toString().repeat(i).toInt())

            for (j in 0..(i - 2)) {
                for (op1 in dp[j]) {
                    for (op2 in dp[dp.size - j - 1]) {
                        case.add(op1 + op2)
                        case.add(op1 - op2)
                        case.add(op1 * op2)

                        if (op2 != 0) {
                            case.add(op1 / op2)
                        }
                    }
                }
            }

            if (case.contains(number)) {
                return i
            }

            dp.add(case)
        }

        return -1
    }
}