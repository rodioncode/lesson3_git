fun main() {
    var num: Int? = null

    while (num == null) {
        print("Введите целое число: ")
        num = readlnOrNull()?.toIntOrNull()

        if (num == null) {
            println("Некорректный ввод3")
        }
    }

    val ball = when (num) {
        in 90..100 -> "A"
        in 75..89 -> "B"
        in 50..74 -> "C"
        in 30..49 -> "D"
        in 0..29 -> "E"
        else -> "неверное значение"
    }

    println(ball)
}