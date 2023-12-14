import java.io.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().toInt().also {
        print(
            if (it % 10 == 0) {
                val a = it / 300
                val b = (it - a * 300) / 60
                val c = (it - a * 300 - b * 60) / 10
    
                "$a $b $c"
            } else {
                -1
            }
        )
    }
}