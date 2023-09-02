fun main() = with(System.`in`.bufferedReader()) {
    val n1 = readLine().toInt()
    val lst = mutableListOf<String>().also { lst ->
        repeat(n1) {
            lst.add(readLine())
        }
    }
    val n2 = readLine().toInt()
    val answer = StringBuilder()

    repeat(n2) {
        readLine().toInt().also {
            answer.append(
                if (it in 1..n1) {
                    "Rule ${it}: ${lst[it - 1]}\n"
                } else {
                    "Rule ${it}: No such rule\n"
                }
            )
        }
    }

    print(answer)
}