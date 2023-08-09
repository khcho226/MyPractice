import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val l = readLine().toInt()
    var hash = 0

    readLine().forEachIndexed { idx, c ->
        hash += (31.0.pow(idx) * (c - 'a' + 1)).toInt() % 1234567891
    }
    
    print(hash)
}