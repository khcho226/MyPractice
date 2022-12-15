import java.util.*
import kotlin.math.floor

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var sortedJobs = jobs.sortedBy { it.first() }
        var task: PriorityQueue<IntArray> = PriorityQueue(compareBy { it.last() })
        var now = 0
        var sum = 0
        
        while (sortedJobs.isNotEmpty() || task.isNotEmpty()) {
            val list = sortedJobs.takeWhile { it.first() <= now }
            
            sortedJobs = sortedJobs.drop(list.size)
            task.addAll(list)
            
            if (task.isEmpty()) {
                now = sortedJobs.first().first()
                continue
            }
            
            task.poll().let {
                now += it.last()
                sum += now - it.first()
            }
        }
        
        return sum / jobs.size
    }
}