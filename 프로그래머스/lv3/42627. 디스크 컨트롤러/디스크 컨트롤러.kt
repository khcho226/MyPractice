import java.util.*
import kotlin.math.floor

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        val task: PriorityQueue<IntArray> = PriorityQueue(compareBy { it.last() })
        var sortedJobs = jobs.sortedBy { it.first() }
        var now = 0
        var sum = 0
        
        while (task.isNotEmpty() || sortedJobs.isNotEmpty()) {
            sortedJobs.takeWhile { it.first() <= now }.let {
                task.addAll(it)
                sortedJobs = sortedJobs.drop(it.size)
            }
            
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