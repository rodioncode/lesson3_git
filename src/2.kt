
fun main() {

    println("Введите баллы")
    val ball: Int = readln()?.toInt()?:0
    when (ball) {
        in 89..100 -> {
            println("Оценка А")
        }
        in 75..89 -> {
            println("Оценка B")
        }
        in 50..74 -> {
            println("Оценка C")
        }
        in 30..49 -> {
            println("Оценка D")
        }
        in 1..29 -> {
            println("Оценка F")
        }
    }
}
