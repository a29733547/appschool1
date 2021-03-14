/*fun main(args: Array<String>){

    val arrayList = ArrayList<String>()//Creating an empty arraylist
    arrayList.add("Java")//Adding object in arraylist
    arrayList.add("Charp")
    arrayList.add("Python")
    arrayList.add("PHP")
    arrayList.add("SQL")
    println(".......打印 ArrayList 结果如下 .......")
    for (i in arrayList) {
        println(i)
    }
}*/


fun main(args: Array<String>){

    val arrayList1 = ArrayList<String>(5)
    arrayList1.add("C++")//Adding object in arraylist
    arrayList1.add("Object-C")
    arrayList1.add("Python")
    arrayList1.add("Java")
    arrayList1.add("SQL")
    println(".......print ArrayList1......")
    for (i in arrayList1) {
        println(i)
    }
    println("size of arrayList1 = "+arrayList1.size)
    val arrayList2 = ArrayList<Int>(5)
    arrayList2.add(14)
    arrayList2.add(20)
    arrayList2.add(80)
    println("......print ArrayList2......")
    for (i in arrayList2) {
        println(i)
    }
    println("size of arrayList2 = "+arrayList2.size)
}


/* Week2 Q4  有待改進加強 語法

ArrayList:
使list陣列資料重複多數引用，但若要修改程式需要連動一起變動

LinkedList
依序去執行，中途比較方便去做修改

---------------------------------參考資料-----------------------------
網路資料 1
在集合(Collection)中，我們常使用List這個介面(Interface)。要實作List，
通常會使用 ArrayList或 LinkedList 這兩個Class。那麼何時使用ArrayList較好，又何時使用LinkedList較好呢?

ArrayList採用的資料結構是Array(陣列)；LinkedList採用的資料結構是 LinkedList (翻譯為鏈結串列或連結串列)。
陣列是在大家學習集合前必須要有的基礎知識，因此在這邊先簡單的介紹鏈結串列。鍊節串列的每一個節點包含的資訊有：
1. 本身儲存的資料 2. 指到另一個節點所在的位址。
鍊節串列可分為單向鍊節串列，雙向鍊節串列，迴圈鍊節串列等等。
詳情可參閱維基百科： 連結串列。

那麼，何時使用ArrayList，何時使用LinkedList較好呢？

當我們需要頻繁的取得List內的資料時，使用ArrayList的效率較好，因為它的資料結構是array，array
採用隨機存取(random access)的方式，也就是直接透過索引(Index)，取得值。 而LinkedList要取得值必須
從開始的節點一路搜尋到要需要的值的位址，需要花費大量的時間。

當我們需要頻繁的新增資料與刪除資料時，使用LinkedList較好。因為使用LinkedList新增/刪除資料時，
只要改動被新增/刪除的那筆資料前面一個節點所指向的位址及可。但若使用ArrayList，要新增或刪除array的資料，
新增/刪除結束後，需要重新搬動剛才被新增/刪除之後的所有節點，並且重新給定之後所有節點的索引值，

網路資料2
ArrayList和LinkedList在性能上各有优缺点，都有各自所适用的地方，总的说来可以描述如下：
1．对ArrayList和LinkedList而言，在列表末尾增加一个元素所花的开销都是固定的。对ArrayList而言，
主要是在内部数组中增加一项，指向所添加的元素，偶尔可能会导致对数组重新进行分配；而对LinkedList而言，
这个开销是统一的，分配一个内部Entry对象。
2．在ArrayList的中间插入或删除一个元素意味着这个列表中剩余的元素都会被移动；
而在LinkedList的中间插入或删除一个元素的开销是固定的。
3．LinkedList不支持高效的随机元素访问。
4．ArrayList的空间浪费主要体现在在list列表的结尾预留一定的容量空间，
而LinkedList的空间花费则体现在它的每一个元素都需要消耗相当的空间
可以这样说：当操作是在一列数据的后面添加数据而不是在前面或中间,并且需要随机地访问其中的元素时,
使用ArrayList会提供比较好的性能；当你的操作是在一列数据的前面或中间添加或删除数据,
并且按照顺序访问其中的元素时,就应该使用LinkedList了。

網路資料3
ArrayList<T>，列表的LinkedList<T>等記憶表示和運算的邏輯在具體實現中定義，
例如LinkedList<T>中的索引遍歷鏈接並花費O（n）時間，而ArrayList<T>將其項目存儲在動態分配的數組中。

網路資料4
ArrayList和LinkedList的相同點和不同點
共同點：都是單列集合中List接口的實現類。存取有序，有索引，可重復
不同點：
1.底層實現不同：
ArrayList底層實現是數組，LinkedList底層是雙向鏈表，有頭尾指針。
2.ArrayList查詢快，增刪慢。
查詢快：數組隨機訪問，通過數組地址和元素索引計算出元素地址，進行訪問。
增刪慢：增刪不在尾部，都需要移動元素，如果數組容量不足，還需要擴容。（擴容非常影響效率）
擴容：
1.分配一個原數組1.5倍大小的新數組
2.將原數組的內容拷貝到新數組
3.LinkedList查詢慢，增刪快
查詢慢：從頭或尾依次尋址。
增刪快：只需要修改幾個指針的指向。
應用場景：
業務中增刪頻繁，就用LinkedList
業務中主要是查詢，就用ArrayList

LinkedList索引查詢的時候，是從頭開始往後找，還是從尾開始往前找？
答：會先做一個判斷，判斷要查找的元素距離頭部近還是尾部近，距離哪個近就從哪邊找。
 */