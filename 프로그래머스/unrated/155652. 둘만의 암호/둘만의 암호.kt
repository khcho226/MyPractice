class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = ""

        s.forEach {
            var code = it.code
            var cnt = 0

            while (cnt < index) {
                if (code != 122) {
                    code++
                } else {
                    code = 97
                }

                if (skip.contains(code.toChar()).not()) {
                    cnt++
                }
            }

            answer += code.toChar().toString()
        }


        return answer       
    }
}