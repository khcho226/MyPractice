fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    
    print("$a + $b = ${a + b}")
}