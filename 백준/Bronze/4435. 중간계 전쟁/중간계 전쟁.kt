fun main() {
    val gandalf = arrayOf(1, 2, 3, 3, 4, 10)
    val sauron = arrayOf(1, 2, 2, 2, 3, 5, 10)
    val answer = StringBuilder()

    repeat(readLine()!!.toInt()) {
        val scoreG = readLine()!!.split(" ").foldIndexed(0) { idx, acc, it2 ->
            acc + gandalf[idx] * it2.toInt()
        }
        val scoreS = readLine()!!.split(" ").foldIndexed(0) { idx, acc, it2 ->
            acc + sauron[idx] * it2.toInt()
        }

        answer.append(
            when {
                scoreG > scoreS -> "Battle ${it + 1}: Good triumphs over Evil\n"
                scoreG < scoreS -> "Battle ${it + 1}: Evil eradicates all trace of Good\n"
                else -> "Battle ${it + 1}: No victor on this battle field\n"
            }
        )
    }

    println(answer)
}