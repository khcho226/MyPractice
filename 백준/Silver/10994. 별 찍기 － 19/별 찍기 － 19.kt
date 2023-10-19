fun main() = with(System.`in`.bufferedReader()) {
    val arr = makeStar(mutableListOf("*"), 1, readLine().toInt())
    val answer = StringBuilder()

    arr.forEach {
        answer.append("$it\n")
    }

    print(answer)
}

fun makeStar(arr: MutableList<String>, depth: Int, n: Int): MutableList<String> {
    if (depth == n) {
        return arr
    }

    val l = arr.size
    val tempArr = mutableListOf<String>()

    for (i in 0..(l + 3)) {
        var star = ""

        when (i) {
            0, l + 3 -> {
                star += "**" + arr[0] + "**"
            }
            1, l + 2 -> {
                star += "*"

                repeat(l + 2) {
                    star += " "
                }

                star += "*"
            }
            else -> {
                star += "* " + arr[i - 2] + " *"
            }
        }

        tempArr.add(star)
    }

    return makeStar(tempArr, depth + 1, n)
}