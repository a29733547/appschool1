import java.util.concurrent.atomic.AtomicBoolean
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

/**3. How to use ​enum​ in Kotlin? Attach a sample code that use enum in Kotlin.*/

/***/
/*enum class Color{ RED,BLACK,BLUE,GREEN,WHITE }
fun main(args: Array<String>) {
    var color:Color=Color.BLUE
    println(color.name)
    println(color.ordinal)

}*/

/***/
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}
fun main(args: Array<String>) {
    printAllValues<RGB>()
}

/*
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

fun main(arge: Array<String>) {
    val a = 13
    val b = 31
    for (f in IntArithmetics.values()) {
        println("$f($a, $b) = ${f.apply(a, b)}")
    }
}*/

