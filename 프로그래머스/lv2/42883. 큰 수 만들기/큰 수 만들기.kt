class Solution {
    fun solution(number: String, k: Int): String {
        val lst = arrayListOf<Char>()
        var num = k

        number.forEach {
            while (lst.isNotEmpty() && lst.last() < it && num > 0) {
                lst.removeLast()
                num--
            }

            lst.add(it)
        }

        return lst.dropLast(num).joinToString("")
    }
}