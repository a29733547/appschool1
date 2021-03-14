import kotlin.math.pow

/*
6. What’s the ​maximum​ value of ​Int​?
类型	    大小（bits）	    最小值	                            最大值
Byte	8	            -128	                            127
Int	    32	            -2,147,483,648 (-2^31)	            2,147,483,647 (2^31 - 1)
Long	64	            -9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)

If you want to represent integers larger than the limit, what should you do instead of using int variables?
Int toLong

*/

fun main(args : Array<String>) {
    var value1 = 3000000000
    val value2: Long =value1.toLong()
    println(value2)
}