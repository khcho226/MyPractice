fun main() = with(System.`in`.bufferedReader()) {
    val label = "WelcomeToSMUPC"
    val n = readLine().toInt() - 1

    print(label[n % 14])
}