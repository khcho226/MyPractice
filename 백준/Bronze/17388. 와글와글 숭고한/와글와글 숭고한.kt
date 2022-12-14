import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val nums = StringTokenizer(readLine()).toList().map { (it as String).toInt() }
    val universities = listOf("Soongsil", "Korea", "Hanyang")

    if (nums.sumOf { it } >= 100) {
        print("OK")
    } else {
        print(universities[nums.indexOf(nums.min())])
    }
}