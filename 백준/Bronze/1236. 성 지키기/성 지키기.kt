fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val nArr = BooleanArray(n)
    val mArr = BooleanArray(m)

    for (row in 0 until n) {
        readLine()!!.forEachIndexed { col, it ->
            if (it == 'X') {
                nArr[row] = true
                mArr[col] = true
            }
        }
    }

    print(maxOf(nArr.count { it.not() }, mArr.count { it.not() }))
}