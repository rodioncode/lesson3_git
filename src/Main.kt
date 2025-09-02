//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Введите длину прямоугольника, ")
    val a: Int = readln()?.toInt()?:0
    println("Введите ширину прямоугольника, ")
    val b: Int = readln()?.toInt()?:0
    val p = (2*(a+b))
    val s = (a*b)

    println("Периметр: " + p)
    println("Площадь: " + s)
    }
