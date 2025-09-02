fun main() {
    //Задача
    //запрос длины
    print("Введите длину")
    val a = readLine()!!.toInt()

    //запрос ширины
    print("Введите ширину")
    val b = readLine()!!.toInt()

    //вычисление площади
    val area = a * b

    //вычисление периметра
    val perimeter = 2 * (a + b)

    //Вывод результатов
    println ("Периметр $perimeter")
    println("Площадь $area")
}
