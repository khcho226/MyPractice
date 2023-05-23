fun main() {
    val answer = StringBuilder()

    while (true) {
        val lst = readLine()!!.split(" ").map { it.toInt() }.sorted()

        if (lst[0] == 0) {
            break
        } else if (lst[0] + lst[1] <= lst[2]) {
            answer.append("Invalid\n")
        } else if (lst[0] == lst[1] && lst[1] == lst[2]) {
            answer.append("Equilateral\n")
        } else if (lst[0] == lst[1] || lst[1] == lst[2]) {
            answer.append("Isosceles\n")
        } else {
            answer.append("Scalene\n")
        }
    }

    print(answer)
}