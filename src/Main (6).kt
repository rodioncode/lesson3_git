fun main() {

    println("Задание 1. Периметр и площадь прямоугольника")
    rectangle()

    println("Задание 2. Оценка в зависимости от баллов")
    grade()

    println("Задание 3. Таблица умножения для числа N")
    multiTable()

    println("Задание 4. Ряд Фибоначчи для n элементов")
    fibonacci()

}


fun rectangle() {

    var length: Double? = null

    while (length == null) {
        println("Высота: ")
        length = readLine()?.toDoubleOrNull()
        if (length == null) {
            println("Неверный ввод")
        }
    }

    var width: Double? = null

    while (width == null) {
        println("Ширина: ")
        width = readLine()?.toDoubleOrNull()
        if (width == null) {
            println("Неверный ввод")
        }
    }

    println("Периметр = ${2 * length + 2 * width}, площадь = ${length * width} \n")

}


fun grade() {

    var studentPoints: Int? = null
    while (studentPoints == null) {
        println("Оценка студента по шкале: ")
        studentPoints = readLine()?.toIntOrNull()
        if (studentPoints == null) {
            println("Неверный ввод")
        }
    }

    when {
        studentPoints in 0..29 -> println("Оценка F")
        studentPoints in 30..49 -> println("Оценка D")
        studentPoints in 50..74 -> println("Оценка C")
        studentPoints in 75..89 -> println("Оценка B")
        studentPoints in 90..100 -> println("Оценка A")
        else -> {
            println("Оценка должна быть от 0 до 100")
            grade()
        }
    }


}


fun multiTable() {

    var numberN: Int? = null

    while (numberN == null) {
        println("Число N: ")
        numberN = readLine()?.toIntOrNull()
        if (numberN == null) {
            println("Неверный ввод")
        }
    }

    println("Таблца умножения для $numberN: ")
    for (i in 1..numberN) {
        println("$numberN * $i = ${numberN * i}")
    }

}


fun fibonacci() {

    var numberN: Int? = null

    while (numberN == null) {
        println("Число N: ")
        numberN = readLine()?.toIntOrNull()
        if (numberN == null) {
            println("Неверный ввод")
        }
    }

    val numbers = Array(numberN) { i -> 0 }
    numbers[1] = 1

    for (i in 2..<numberN) {
        numbers[i] = numbers[i - 1] + numbers[i - 2]
    }

    for (i in numbers) {
        print("$i ")
    }

}


