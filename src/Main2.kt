//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("enter number")
    val number: Int? = readlnOrNull()?.toInt() ?: 0

    val ball = when (number) {
        in 90..100 -> "A"
        in 75..89 -> "B"
        in 50..74 -> "C"
        in 30..49 -> "D"
        in 0..29 -> "E"
        else -> println("неверное значение")
    }
    println(ball)
}
