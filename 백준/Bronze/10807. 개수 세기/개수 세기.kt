fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val v = readLine()!!.toInt()
    var result = 0

    list.forEach {
        if (it == v) {
            result += 1
        }
    }
    
    println(result)
}