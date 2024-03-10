import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var cntB = 0
    var cntC = 0

    readLine().forEach {
        if (it == 'B') {
            cntB++
        } else {
            cntC++
        }
    }
    
    print(cntB / 2 + cntC / 2)
}