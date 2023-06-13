import java.util.*

fun main() {
    StringTokenizer(readLine()).also {
        print(it.nextToken().toLong() * it.nextToken().toLong() / 2)
    }
}