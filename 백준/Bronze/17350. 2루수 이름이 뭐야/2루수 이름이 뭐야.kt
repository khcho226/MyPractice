fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        if (readLine() == "anj") {
            print("뭐야;")
            return
        }
    }
    
    print("뭐야?")
}