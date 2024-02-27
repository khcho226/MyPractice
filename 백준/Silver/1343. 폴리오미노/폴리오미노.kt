import java.io.*

val sb = StringBuilder()
var cnt = 0

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().forEach {
        if (it == 'X') {
            cnt++
        } else {
            if (placePolyomino().not()) {
                print(-1)
                return
            }

            sb.append(".")
        }
    }

    if (placePolyomino().not()) {
        print(-1)
        return
    }

    print(sb)
}

fun placePolyomino(): Boolean {
    if (cnt % 2 == 1) {
        return false
    }

    while (cnt >= 1) {
        cnt -= if (cnt >= 4) {
            sb.append("AAAA")
            4
        } else {
            sb.append("BB")
            2
        }
    }

    return true
}