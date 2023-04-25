class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val map = hashMapOf<String, Int>().apply {
            players.forEachIndexed { idx, it ->
                this[it] = idx
            }
        }

        callings.forEach {
            val idx = map[it]!!

            map.replace(it, idx - 1)
            map.replace(players[idx - 1], idx)
            players[idx] = players[idx - 1]
            players[idx - 1] = it
        }

        return players
    }
}