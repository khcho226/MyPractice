fun main() = with(System.`in`.bufferedReader()) {
    val emoticon = readLine()
    var numC = 0
    var numU = 0

    emoticon.forEach {
        if (it == ':') {
            numC++
        } else if (it == '_') {
            numU++
        }
    }

    print(emoticon.length + numC + numU * 5)
}