fun main() = with(System.`in`.bufferedReader()) {
    val arr = arrayOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )
    var flag = false

    for (i in 0 until readLine().toInt()) {
        if (arr.contains(readLine()).not()) {
            flag = true
            break
        }
    }

    print(
        if (flag) {
            "Yes"
        } else {
            "No"
        }
    )
}