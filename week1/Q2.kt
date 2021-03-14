// week Q2
// 03行的message字串為40位元,對於when裡的方程式為07行列的in 40..56之間
// 顯示為 “ MY load "
fun main(args: Array<String>){
    var message = "Hello and welcome to Appschool School :)"
    when (message.length) {
        0 -> println("Aye")
        in 1..39 -> println("Your grace.")
        in 40..56 -> println("My lord")
        else -> println("You konw nothing...")
    }
}