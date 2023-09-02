fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val lst = mutableListOf<String>().also { lst ->
        repeat(n) {
            lst.add(readLine())
        }
    }
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().toInt().also {
            answer.append(
                if (it in 1..n) {
                    "Rule ${it}: ${lst[it - 1]}\n"
                } else {
                    "Rule ${it}: No such rule\n"
                }
            )
        }
    }

    print(answer)
}