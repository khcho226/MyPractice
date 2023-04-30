fun main() {
    val start = readLine()!!.split(":").map { it.toInt() }
    val end = readLine()!!.split(":").map { it.toInt() }
    var h = end[0] - start[0]
    var m = end[1] - start[1]
    var s = end[2] - start[2]

    if (s < 0) {
        s += 60
        m--
    }

    if (m < 0) {
        m += 60
        h--
    }
    
    if (h < 0) {
        h += 24
    }

    print("${h.toString().padStart(2, '0')}:${m.toString().padStart(2, '0')}:${s.toString().padStart(2, '0')}")
}