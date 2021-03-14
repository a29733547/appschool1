/*
week Q3
arrayof 總共是6個陣列 0~5, 6個陣列的函數分別相差為*1000.
units[i]會依據次數將arrayof裡面串列顯示.
value.toLong會將value返結果且因for回圈帶回到val array,這時需要一個運算函數指令去計算,
1000.0.pow(it)為依據Array所輸入的次數做函數 1000^6
#目前有疑問 "it"為 1000^1~6次方而不是其他？ 是否為因為kotlin的掛載其他程式定義為？
*/

import kotlin.math.pow

fun main(args: (Array<String>)) {
    val array = Array(6) {1000.0.pow(it)}
    val units = arrayOf("byte", "KB", "MB", "GB", "TB", "PB")
    for ((i, value ) in array.withIndex()) {
        println(" 1 ${units[i]} = ${value.toLong()} byte\n")
    }
}