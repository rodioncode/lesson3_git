//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() { //первое
 println("Введите длину: ")
    val a = readln().toInt()
    println("Введите ширину: ")
    val b = readln().toInt()
    val sum = ("${a*b}")
    println("Площадь прямоугольника равен: $sum ")
    val num = ("${2*(a+b)}")
    println("Периметр прямоугольника равен: $num ")
}




fun sec(){
    println("Введите число: ")
    val n = readln().toInt()

    for(i in 1..10){
        println("$n*$i=${n*i}")
    }
} //третье



//второе
fun three(){
    while(true){
        println("Введите число: ")
        val n = readln().toInt()
        if (n<0){
            println("неверно")
          break
        }

        when (n){
            in 90..100 -> println("Оценка A")
            in 75..89 -> println("Оценка B")
            in 50..74 -> println("Оценка C")
            in 30..49 -> println("Оценка D")
            in 0..29 -> println("Оценка F")
            else -> println("Ошибка")
        }
    }
}