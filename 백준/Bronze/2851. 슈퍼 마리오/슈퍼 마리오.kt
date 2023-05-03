fun main() {
    var temp: Int
    var total = 0

    repeat(10) {
        temp = total + readLine()!!.toInt()

        if (temp >= 100) {
            if (temp + total > 200) {
                temp = total
            }

            println(temp)
            return
        }

        total = temp
    }
    
    println(total)
}