fun main() = with(System.`in`.bufferedReader()) {
    var score = 0

    repeat(readLine().toInt()) {
        val arr = readLine().split(" ").map { it.toInt() }
        val a1 = arr.subList(0, 2).sorted()
        val a2 = arr.subList(2, 7).sorted()

        score = maxOf(score, a1[1] + a2[3] + a2[4])
    }

    print(score)
}