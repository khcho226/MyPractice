fun main() {
    val lst = readLine()!!.split(" ").map { it.toInt() }.sorted()
    
    if (lst[0] + lst[1] > lst[2]) {
        print(lst[0] + lst[1] + lst[2])
    } else {
        print(2 * (lst[0] + lst[1]) - 1)
    }
}