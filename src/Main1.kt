//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("enter num1")
    val num1: Int = readlnOrNull()?. toInt() ?: 0
    println("enter num2")
    val num2: Int = readlnOrNull()?. toInt() ?: 0
    val perimetr = ((num1 + num2)*2)
    println(perimetr)
    val square = (num1 * num2)
    println(square)

}


