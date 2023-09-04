fun main() = with(System.`in`.bufferedReader()) {
    val arr1 = arrayOf('b', 'd', 'i', 'o', 'p', 'q', 'v', 'w', 'x')
    val arr2 = arrayOf('d', 'b', 'i', 'o', 'q', 'p', 'v', 'w', 'x')
    val answer = StringBuilder()
    var word = readLine()

    while (word != "#") {
        var mirrored = ""
        var flag = false

        for (i in word.indices) {
            arr1.indexOf(word[i]).also {
                if (it != -1) {
                    mirrored += arr2[it]
                } else {
                    flag = true
                }
            }

            if (flag) {
                break
            }
        }

        answer.append(
            if (flag) {
                "INVALID\n"
            } else {
                "${mirrored.reversed()}\n"
            }
        )

        word = readLine()
    }

    print(answer)
}