import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val k = readLine().toInt()
    val code = readLine()
    val arr = arrayListOf<ArrayList<Char>>()
    var isRight = true

    repeat(k) { arr.add(arrayListOf()) }

    code.forEachIndexed { idx, c ->
        if (isRight) {
            arr[idx % k].add(c)
        } else {
            arr[k - idx % k - 1].add(c)
        }

        if ((idx + 1) % k == 0) {
            isRight = isRight.not()
        }
    }

    print(arr.fold("") { result, arrayList -> result + arrayList.joinToString("") })
}