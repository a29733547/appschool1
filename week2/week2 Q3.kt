// week2 Q3
/*
3. What kind of ​key-value​ pair collection do we use in Android?
--> mapof
Attach a sample code that uses for-loop to print each key-value pair.
*/

fun main(args: Array<String>) {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    for (iii in numbersMap)
        println(iii)
}

