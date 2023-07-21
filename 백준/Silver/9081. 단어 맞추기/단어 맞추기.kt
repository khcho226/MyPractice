fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val arr = readLine().toCharArray()

        for (i in arr.size - 2 downTo 0) {
            var char = Pair('[', 0)

            for (j in i until arr.size) {
                if (arr[i] < arr[j] && arr[j] < char.first) {
                    char = Pair(arr[j], j)
                }
            }

            if (char.first != '[') {
                arr[char.second] = arr[i]
                arr[i] = char.first
                arr.sort(i + 1, arr.size)
                break
            }
        }

        answer.append("${String(arr)}\n")
    }

    print(answer)
}