//可將指定的字串文字等帶入Ｓtring, 被Ｓtring裡被指定的文字會變成", ”
//若有較特別的指定文字,如“," "|" "*" 特殊已經被定義的前面需要加上 "\\"
fun main(args: Array<String>) {
val str = "This is a string"
    val split = str.split(" ")
    println(split) // This, is, a, string
}
