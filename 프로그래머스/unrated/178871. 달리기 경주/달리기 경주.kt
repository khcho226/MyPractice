class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val arr = arrayListOf<String>().apply {
            this.addAll(players)
        }
        val map = mutableMapOf<String, Int>().apply {
            players.forEachIndexed { idx, it ->
                this[it] = idx
            }
        }

        callings.forEach {
            val idx = map[it]

            map[it] = map[it]?.minus(1) ?: 0
            map[arr[idx!! - 1]] = map[arr[idx - 1]]!! + 1

            val temp = arr[idx - 1]

            arr[idx - 1] = arr[idx]
            arr[idx] = temp
        }

        return arr.toTypedArray()
    }
}