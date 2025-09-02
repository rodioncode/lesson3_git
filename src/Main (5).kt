//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("enter length : ")
    var length = readln().toDouble()
    if (length <= 0) {
        println("incorrect value")
    }
    print("enter width : ")
    var width = readln().toDouble()
    if (width <= 0) {
        println("incorrect value")

    }
    var perimeter = (length + width) * 2
    var square = length * width
    println("meaning Perimetr: $perimeter")
    println("meaning Square: $square")
    Shcala()
    Fibonacci()
    Calc()
}


fun Shcala() {
    print("enter points : ")
    var i = readln().toInt()
    when {
        i in 0..29 -> println("F")
        i in 30..49 -> println("D")
        i in 50..74 -> println("C")
        i in 75..89 -> println("B")
        i in 90..100 -> println("A")
        else -> println("incorrect points")
    }
}

fun Calc() {
    for (n in 1..10) {
        println("enter N: ")
        var n = readln().toInt()

        for (i in 1..10) {
            val sum = n * i
            println("$n × $i = $sum")


        }
    }
}

fun Fibonacci() {
    val n = readln().toInt()
    val result = when (n) {
        0 -> 0
        1 -> 1
        else -> {
            var a = 0
            var b = 1
            var fib = 0

            for (i in 2..n) {
                fib = a + b
                a = b
                b = fib
            }
            fib
        }
    }

    println("$n number fib: $result")
}




