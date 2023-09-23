fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()
    val loc = mapOf(
        "Algorithm" to "204",
        "DataAnalysis" to "207",
        "ArtificialIntelligence" to "302",
        "CyberSecurity" to "B101",
        "Network" to "303",
        "Startup" to "501",
        "TestStrategy" to "105"
    )

    repeat(readLine().toInt()) {
        answer.append("${loc[readLine()]}\n")
    }

    print(answer)
}