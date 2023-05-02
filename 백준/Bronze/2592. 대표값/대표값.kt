fun main() {
    val arr = Array(10) { readLine()!!.toInt() }

    println(arr.average().toInt())
    println(arr.groupingBy { it }.eachCount().maxBy { it.value }.key)
}