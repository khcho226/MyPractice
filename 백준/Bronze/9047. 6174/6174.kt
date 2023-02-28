import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()

    repeat(n) {
        var num = readLine()
        var cnt = 0

        while (num != "6174") {
            num = kaprekar(num)
            cnt++
        }

        println(cnt)
    }
}

fun kaprekar(input: String): String {
    val arr = input.toCharArray().sorted()
    var result = (arr.reversed().joinToString("").toInt() - arr.joinToString("").toInt()).toString()
    
    while (result.length != 4) {
        result = "0$result"
    }

    return result
}
