import kotlin.math.sqrt

class Solution {
    val permutations = mutableListOf<List<Int>>()

    fun solution(numbers: String): Int {
        setPermutation(numbers.map { it - '1' + 1 })

        return permutations.drop(1)
            .map { it.joinToString("").toInt() }
            .distinct()
            .filter { isPrime(it) }
            .size
    }

    fun setPermutation(input: List<Int>, final: List<Int> = listOf(), sub: List<Int> = input): List<List<Int>> {
        permutations.add(final)

        return if (sub.isEmpty()) {
            listOf(final)
        } else {
            sub.flatMap { setPermutation(input, final + it, sub - it) }
        }
    }
    
    fun isPrime(input: Int): Boolean {
        return if (input <= 1) {
            false
        } else {
            (2..sqrt(input.toDouble()).toInt()).none { input % it == 0 }
        }
    }
}