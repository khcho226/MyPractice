import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val map = hashMapOf<String, Int>()
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    repeat(n) {
        readLine().also {
            if (it.length >= m) {
                if (map[it] == null) {
                    map[it] = 1
                } else {
                    map[it] = map[it]!! + 1
                }
            }
        }
    }

    map.entries.sortedWith { o1, o2 ->
        when {
            o1.value != o2.value -> o2.value.compareTo(o1.value)
            o1.key.length != o2.key.length -> o2.key.length.compareTo(o1.key.length)
            else -> o1.key.compareTo(o2.key)
        }
    }.forEach {
        bw.write("${it.key}\n")
    }
    bw.flush()
    bw.close()
}