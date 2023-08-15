fun main() = with(System.`in`.bufferedReader()) {
    val (k, d, a) = readLine().split("/").map { it.toInt() }

    print(
        if (k + a < d || d == 0) {
            "hasu"
        } else {
            "gosu"  
        }
    )
}