import java.io.*
import java.util.*
import kotlin.math.sqrt

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = StringTokenizer(readLine()).nextToken().toInt()
    val arr = mutableListOf<Int>()

    repeat(n) { arr.add(StringTokenizer(readLine()).nextToken().toInt()) }
    arr.sort()

    for (i in 0..arr.size - 2) {
        arr[i] = arr[i + 1] - arr[i]
    }

    var gcd = arr.first()

    for (i in 1..arr.size - 2) {
        gcd = findGcd(gcd, arr[i])
    }

    val set = mutableSetOf(gcd)

    for (i in 2..sqrt(gcd.toFloat()).toInt()) {
        if (gcd % i == 0) {
            set.add(i)
            set.add(gcd / i)
        }
    }

    val result = StringBuilder()

    for (i in set.sorted()) {
        result.append(i.toString()).append(" ")
    }

    println(result)
}

fun findGcd(a: Int, b: Int): Int {
    val rest = b % a

    return if (rest != 0) {
        findGcd(rest, a)
    } else {
        a
    }
}