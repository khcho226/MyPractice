import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0
    var axis = 0

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val x = token.nextToken().toInt()
        val y = token.nextToken().toInt()

        if (x > 0 && y > 0) {
            q1++
        } else if (x < 0 && y > 0) {
            q2++
        } else if (x < 0 && y < 0) {
            q3++
        } else if (x > 0 && y < 0) {
            q4++
        } else {
            axis++
        }
    }

    print("Q1: $q1\nQ2: $q2\nQ3: $q3\nQ4: $q4\nAXIS: $axis")
}