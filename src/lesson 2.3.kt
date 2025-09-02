fun main() {
    println("input number:")
    val n = readLine()!!.toInt()

    for (n in 1..9)

        if (n != null) {
            println("$n:")

            // Выводим таблицу умножения от 1 до 9
            for (i in 1..9) {
                println("$n * $i = ${n * i}")
            }
        } else {
            println("Ошибка")
        }
}