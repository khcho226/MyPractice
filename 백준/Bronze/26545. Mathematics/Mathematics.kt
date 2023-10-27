fun main() = with(System.`in`.bufferedReader()) {
    var total = 0
    
    repeat(readLine().toInt()) {
        total += readLine().toInt()
    }
    
    print(total)
}