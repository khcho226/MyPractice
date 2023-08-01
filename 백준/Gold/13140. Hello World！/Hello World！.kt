import kotlin.system.*

val visited = BooleanArray(10)
val picked = mutableListOf<Int>()
val nums = IntArray(10) { it }
var n = 0
var hello = 0
var world = 0

fun main() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    perm(0, 7)
    print("No Answer")
}

fun perm(cnt: Int, depth: Int) {
    if (cnt == depth) {
        calc()
        return
    }

    for (i in 0..9) {
        if (visited[i].not()) {
            visited[i] = true
            picked.add(nums[i])
            perm(cnt + 1, depth)
            picked.removeLast()
            visited[i] = false
        }
    }
}

fun calc() {
    if (picked[0] == 0 || picked[4] == 0) {
        return
    }

    hello = 10000 * picked[0] + 1000 * picked[1] + 100 * picked[2] + 10 * picked[2] + picked[3]
    world = 10000 * picked[4] + 1000 * picked[3] + 100 * picked[5] + 10 * picked[2] + picked[6]

    if (hello + world == n) {
        print("  ${hello}\n+ ${world}\n-------\n${n.toString().padStart(7, ' ')}")
        exitProcess(0)
    }
}