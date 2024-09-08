class Solution {
    fun solution(names: Array<String>): Array<String> {
        return names.toList().filterIndexed { idx, _ ->
            idx % 5 == 0
        }.toTypedArray()
    }
}