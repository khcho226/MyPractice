class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var lux = 50
        var luy = 50
        var rdx = 0
        var rdy = 0
        
        wallpaper.forEachIndexed { idx1, it1 ->
            it1.forEachIndexed { idx2, it2 ->
                if (it2 == '#') {
                    lux = minOf(lux, idx1)
                    luy = minOf(luy, idx2)
                    rdx = maxOf(rdx, idx1)
                    rdy = maxOf(rdy, idx2)
                }
            }
        }
        
        return intArrayOf(lux, luy, rdx + 1, rdy + 1)
    }
}