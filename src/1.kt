//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun exercise01(
    ) {
        println("Viktar Salauyou Lesson02 Homework")
        println("Exercise01")
        println("Calculating area and perimeter of rectangle")

        println("Input Rectangle lenght")
        val rectangleLenght: Int = readLine()?.toIntOrNull() ?: 0

        println("Input Rectangle Weidth")
        val rectangleWeidth: Int = readLine()?.toIntOrNull() ?: 0

        val rectangleArea: Int = rectangleLenght * rectangleWeidth
        val rectanglePerimeter: Int = (rectangleLenght + rectangleWeidth) * 2
        println("Area = $rectangleArea Perimeter = $rectanglePerimeter  ")


    }

    fun exercise02() {
        println("Input Student test score ")
        println("Exercise02")

        val score: Int = readLine()?.toIntOrNull() ?: 0

        when (score) {
            in 0..29 -> {
                println("Grade F")
            }
            in 30..49 -> {
                println("Grade D")
            }
            in 50..74 -> {
                println("Grade C")
            }
            in 75..89 -> {
                println("Grade B")
            }
            in 90..100 -> {
                println("Grade A")
            }
            else -> {
            }
        }


    }

    fun exercise03() {
        println("Exercise03")
        println("Input Number for multiplying ")
        val num: Int = readLine()?.toIntOrNull() ?: 0
        val num1: Int = num * 1
        val num2: Int = num * 2
        val num3: Int = num * 3
        val num4: Int = num * 4
        val num5: Int = num * 5
        val num6: Int = num * 6
        val num7: Int = num * 7
        val num8: Int = num * 8
        val num9: Int = num * 9

        println("$num * 1 = $num1")
        println("$num * 2 = $num2")
        println("$num * 3 = $num3")
        println("$num * 4 = $num4")
        println("$num * 5 = $num5")
        println("$num * 6 = $num6")
        println("$num * 7 = $num7")
        println("$num * 8 = $num8")
        println("$num * 9 = $num9")


    }

    fun exercise04() {
        println("Exercise04")
        println("Enter the position in Fibonacci sequence: ")

        val n: Int = readLine()?.toIntOrNull() ?: 0

        var a = 0
        var b = 1

        if (n == 0) {
            println("Fibonacci number at position $n is $a")
            return
        } else if (n == 1) {
            println("Fibonacci number at position $n is $b")
            return
        }
        var result = 0
        for (i in 2..n) {
            result = a + b
            a = b
            b = result
        }

        println("Fibonacci number at position $n is $result")

    }
    exercise01()
    exercise02()
    exercise03()
    exercise04()

}








