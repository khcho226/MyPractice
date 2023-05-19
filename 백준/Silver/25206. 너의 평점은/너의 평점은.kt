fun main() {
    var totalCredit = 0.0
    var totalScore = 0.0

    repeat(20) {
        val (_, credit, score) = readLine()!!.split(" ")

        if (score == "P") {
            return@repeat
        }

        totalCredit += credit.toDouble()
        totalScore += credit.toDouble() * getScore(score)
    }

    print(totalScore / totalCredit)
}

fun getScore(score: String): Double {
    return when (score) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        else -> 0.0
    }
}