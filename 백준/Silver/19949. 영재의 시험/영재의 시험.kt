private lateinit var lst: List<Int>
val nums = mutableListOf<Int>()
var cnt = 0

fun main(): Unit = with(System.`in`.bufferedReader()) {
    lst = readLine().split(" ").map { it.toInt() }
    back(0)
    print(cnt)
}

fun back(depth: Int) {
    if (depth == 10) {
        count()
        return
    }

    for (i in 1..5) {
        if (depth >= 2 && i == nums[depth - 1] && i == nums[depth - 2]) {
            continue
        }

        nums.add(i)
        back(depth + 1)
        nums.removeLast()
    }
}

fun count() {
    var score = 0

    lst.forEachIndexed { idx, it ->
        if (nums[idx] == it) {
            score++
        }
    }

    if (score >= 5) {
        cnt++
    }
}