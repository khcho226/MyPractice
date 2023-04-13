class Solution {
    val arr = arrayOf("A", "E", "I", "O", "U")
    val list = mutableListOf<String>()
    
    fun solution(word: String): Int {
        dfs("")
        
        return list.indexOf(word)
    }
    
    fun dfs(input: String) {
        if (input.length > 5) {
            return
        }
        
        list.add(input)
        arr.forEach { dfs(input + it) }
    }
}