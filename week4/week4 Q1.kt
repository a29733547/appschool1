/**1. What is Polymorphism? Try to explain in Mandarin.*/
//使用一個動作去呼叫其他類別並得到不同的結果,例如 滑鼠點擊 在不同的環境會出現不同的結果 但點擊的動作一樣

fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}

fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}

fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}

fun main(args: Array<String>){
    val a : Number = 99
    val b = 1
    val c = 3.1

    printNumber(a) //Which version of printNumber is getting used?
    printNumber(b) //Which version of printNumber is getting used?
    printNumber(c) //Which version of printNumber is getting used?
}