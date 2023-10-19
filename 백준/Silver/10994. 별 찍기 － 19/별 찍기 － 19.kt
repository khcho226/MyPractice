fun main() = with(System.`in`.bufferedReader()) {
    var arr = mutableListOf("*")

    repeat(readLine().toInt() - 1) {
        arr = makeStar(arr)
    }

    arr.forEach {
        println(it)
    }
}

fun makeStar(arr: MutableList<String>): MutableList<String> {
    val l = arr.size
    val tempArr = mutableListOf<String>()

    for (i in 0..(l + 3)) {
        var star = ""

        when (i) {
            0, l + 3 -> {
                repeat(l + 4) {
                    star += "*"
                }
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

    return tempArr
}