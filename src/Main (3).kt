//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        println("Введите цифру от 1 до 9")
    val num: Int = readln()?.toInt()?:0
    for (i in 1..9){
        println(" ${num*i}")
    }
    }
