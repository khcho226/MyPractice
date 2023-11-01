fun main() = with(System.`in`.bufferedReader()) {
    print(
        when (readLine()) {
            "fdsajkl;", "jkl;fdsa" -> "in-out"
            "asdf;lkj", ";lkjasdf" -> "out-in"
            "asdfjkl;" -> "stairs"
            ";lkjfdsa" -> "reverse"
            else -> "molu"
        }
    )
}