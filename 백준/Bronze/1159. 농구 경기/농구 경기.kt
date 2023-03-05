import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val map = mutableMapOf<String, Int>()
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val key = readLine().substring(0, 1)

        if (map.containsKey(key)) {
            map[key] = map[key]!! + 1
        } else {
            map[key] = 1
        }
    }

    map.toSortedMap().forEach { (key, value) ->
        if (value >= 5) {
            answer.append(key)
        }
    }

    if (answer.isNotEmpty()) {
        print(answer)
    } else {
        print("PREDAJA")
    }
}
