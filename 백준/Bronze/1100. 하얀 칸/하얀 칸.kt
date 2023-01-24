import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var answer = 0

    repeat(8) { row ->
        readLine().forEachIndexed { col, it ->
            if ((row + col) % 2 == 0 && it == 'F') {
                answer++
            }
        }
    }
    print(answer)
}