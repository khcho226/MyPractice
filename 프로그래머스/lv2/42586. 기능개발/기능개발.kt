import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var arr = intArrayOf()
        var max = 0.0
        var cnt = 1
        
        progresses.mapIndexed { idx, it -> ceil((100 - it).toDouble() / speeds[idx]) }
            .forEach {
                if (it > max) {
                    if (max != 0.0) {
                        arr = arr.plus(cnt)
                        cnt = 1
                    }
                    
                    max = it
                } else {
                    cnt++
                }
            }
    
        return arr.plus(cnt)
    }
}