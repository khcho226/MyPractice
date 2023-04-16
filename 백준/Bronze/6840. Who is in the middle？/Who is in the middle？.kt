fun main() {
    val nums = arrayListOf<Int>()

    repeat(3) { nums.add(readLine()!!.toInt()) }
    print(nums.sorted()[1])
}