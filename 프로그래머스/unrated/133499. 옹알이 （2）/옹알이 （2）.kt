class Solution {
    fun solution(babbling: Array<String>): Int {
        val words = arrayOf("aya", "ye", "woo", "ma")
        var answer = 0
        
        babbling.forEach {
            var temp = it
            
            for (i in words.indices) {
                if (temp.contains(words[i] + words[i])) {
                    break
                } else {
                    temp = temp.replace(words[i], " ")
                }
            }
            
            if (temp.replace(" ", "").isEmpty()) {
                answer++
            } 
        }
        
        return answer
    }
}