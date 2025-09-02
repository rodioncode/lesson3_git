//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Введите баллы")
     val ball: Int = readln()?.toInt()?:0
    if (ball in 90..100) {
        println("Оценка А")
    }
    else if (ball in 75..89) {
        println("Оценка B")
    }
    else if (ball in 50..74){
        println("Оценка C")
    }
    else if (ball in 30..49) {
        println("Оценка D")
    }
    else if (ball in 1..29) {
         println ("Оценка F")
    }
}
