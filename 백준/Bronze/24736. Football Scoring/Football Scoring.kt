import java.util.*

fun main() {
    val arr = intArrayOf(0, 0)

    repeat(2) {
        StringTokenizer(readLine()).also { t ->
            arr[it] += t.nextToken().toInt() * 6
            arr[it] += t.nextToken().toInt() * 3
            arr[it] += t.nextToken().toInt() * 2
            arr[it] += t.nextToken().toInt()
            arr[it] += t.nextToken().toInt() * 2
        }
    }

    print("${arr[0]} ${arr[1]}")
}