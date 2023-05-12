class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val typeArr = arrayOf(Pair('R', 'T'), Pair('C', 'F'), Pair('J', 'M'), Pair('A', 'N'))
        val map = mutableMapOf<Char, Int>().apply {
            typeArr.forEach {
                this[it.first] = 0
                this[it.second] = 0
            }
        }
        var answer = ""

        survey.forEachIndexed { idx, type ->
            choices[idx].let {
                if (it <= 3) {
                    map[type[0]] = map[type[0]]!!.plus(4 - it)
                } else if (it >= 5) {
                    map[type[1]] = map[type[1]]!!.plus(it - 4)
                }
            }
        }

        typeArr.forEach {
            answer += if (map[it.first]!! >= map[it.second]!!) {
                it.first
            } else {
                it.second
            }
        }

        return answer
    }
}