fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(10)

    repeat(5) {
        arr[readLine().toInt()]++
    }

    for (i in 0..9) {
        if (arr[i] % 2 == 1) {
            print(i)
            break
        }
    }
}