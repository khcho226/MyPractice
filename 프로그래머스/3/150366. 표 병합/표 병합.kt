class Solution {
    val merged = Array(51) { i -> Array(51) { j -> Pair(i, j) } }
    val contents = Array(51) { Array(51) { "" } }
    val answer = arrayListOf<String>()

    fun solution(commands: Array<String>): Array<String> {
        commands.forEach {
            val command = it.split(" ")

            if (command[0] == "UPDATE") {
                if (command.size == 4) {
                    update1(command[1].toInt(), command[2].toInt(), command[3])
                } else {
                    update2(command[1], command[2])
                }
            } else if (command[0] == "MERGE") {
                merge(command[1].toInt(), command[2].toInt(), command[3].toInt(), command[4].toInt())
            } else if (command[0] == "UNMERGE") {
                unmerge(command[1].toInt(), command[2].toInt())
            } else {
                print(command[1].toInt(), command[2].toInt())
            }
        }

        return answer.toTypedArray()
    }

    fun update1(r: Int, c: Int, value: String) {
        val (x, y) = merged[r][c]

        contents[x][y] = value
    }

    fun update2(value1: String, value2: String) {
        for (i in 1..50) {
            for (j in 1..50) {
                if (contents[i][j] == value1)
                    contents[i][j] = value2
            }
        }
    }

    fun merge(r1: Int, c1: Int, r2: Int, c2: Int) {
        val (x1, y1) = merged[r1][c1]
        val (x2, y2) = merged[r2][c2]

        for (i in 1..50) {
            for (j in 1..50) {
                if (merged[i][j] == Pair(x2, y2)) {
                    merged[i][j] = Pair(x1, y1)
                }
            }
        }

        if (contents[x1][y1] == "" && contents[x2][y2] != "") {
            contents[x1][y1] = contents[x2][y2]
        }
    }

    fun unmerge(r: Int, c: Int) {
        val (x, y) = merged[r][c]
        val content = contents[x][y]

        for (i in 1..50) {
            for (j in 1..50) {
                if (merged[i][j] == Pair(x, y)) {
                    merged[i][j] = Pair(i, j)
                    contents[i][j] = ""
                }
            }
        }

        contents[r][c] = content
    }

    fun print(r: Int, c: Int) {
        val (x, y) = merged[r][c]

        contents[x][y].also {
            answer.add(
                if (it != "") {
                    it
                } else {
                    "EMPTY"
                }
            )
        }
    }
}