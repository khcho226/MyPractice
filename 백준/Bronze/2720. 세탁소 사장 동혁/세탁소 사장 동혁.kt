fun main() {
    val answer = StringBuilder()
    var total: Int
    var quarter: Int
    var dime: Int
    var nickel: Int

    repeat(readLine()!!.toInt()) {
        total = readLine()!!.toInt()
        quarter = total / 25
        total -= quarter * 25
        dime = total / 10
        total -= dime * 10
        nickel = total / 5
        total -= nickel * 5
        answer.append("$quarter $dime $nickel $total\n")
    }

    print(answer)
}