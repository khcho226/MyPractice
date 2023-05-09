import java.util.*

fun main() {
    val queA = PriorityQueue<Int>(reverseOrder())
    val queB = PriorityQueue<Int>(reverseOrder())

    repeat(4) { queA.add(readLine()!!.toInt() )}
    repeat(2) { queB.add(readLine()!!.toInt() )}
    print(queA.poll() + queA.poll() + queA.poll() + queB.poll())
}