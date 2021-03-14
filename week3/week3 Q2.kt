/** 2. Try to explain what is ​enum​ and why we use them.*/
/**只有固定的屬性 如 資料 方式 類別等定義好的物件 並可直接利用*/
/**enum裡的物新增刪除易更改且會依照輸入順序自動排序一些設定*/
/* 網路參考資量
一 可以像一般的類別那樣，透過建構式宣告屬性。此處的屬性包含貨幣的中文名稱和對臺幣的粗略匯率。
enum class CurrencyType(val chineseName: String,
                        val simpleExRate: Double) {
    USD("美元", 30.0),
    CNY("人民幣", 4.5),
    JPY("日圓", 0.3),
    AUD("澳幣", 20.0),
    TWD("臺幣", 1.0)
}

二、使用列舉
列舉如同其他資料型態，也能作為類別的屬性。以下筆者設計一個存款帳戶的類別，以幣別作為其中一個屬性。
class CurrentAccount(val id: String,
                     val currencyType: CurrencyType,
                     var balance: Double) {
}
接著撰寫一段程式，建立數個存款帳戶物件，再印出相關資訊。並將餘額透過匯率換算為臺幣。
val ac1 = CurrentAccount("1", CurrencyType.USD, 3027.5)
val ac2 = CurrentAccount("2", CurrencyType.CNY, 400.0)
val ac3 = CurrentAccount("3", CurrencyType.JPY, 1800.0)

val accounts = listOf(ac1, ac2, ac3)
for (ac in accounts) {
    var info = ""

    info += "幣別：${ac.currencyType.chineseName}\n"
    info += "餘額：${ac.balance}\n"
    info += "換算臺幣：${ac.balance * ac.currencyType.simpleExRate}\n"

    println(info)
}

三、名稱與物件互轉
這些列舉的物件，都是由我們自行取名，例如前面範例的USD、JPY等。Enum類別提供了內建的屬性與方法，
能取得列舉物件的名稱，或藉由名稱字串來取得對應的物件。
enum class CurrencyType(val chineseName: String,
                        val simpleExRate: Double) {
    // 其餘省略
    USD("美金", 30.0); // 添加方法時需要加上分號

    override fun toString() = "$chineseName ${super.toString()}"
}
fun main(args: Array<String>) {
    // 取得名稱，印出：USD
    println(CurrencyType.USD.name)
    // 取得物件並比對，印出：true
    println(CurrencyType.valueOf("USD") == CurrencyType.USD)
    // 印出：美金 USD
    println(CurrencyType.USD.toString())
}
「name」屬性代表列舉物件的名稱。使用「valueOf」方法，可傳入字串，並取得名稱相符的物件（大小寫需相符）。
若物件不存在，會拋出例外。另外，「toString」方法預設會回傳name屬性，因此也能自行使用或覆寫。

四、列舉物件的序數
列舉類別還內建另一個叫做「ordinal」的屬性，它代表的是該物件在類別中的順序，就像陣列與List的索引

五、取得所有列舉物件
如果想要取得所有列舉出的物件，可以使用「values」方法，它會回傳一個包含全部列舉物件的陣列。
println("本程式支援的幣別如下：")
val types: Array<CurrencyType> = CurrencyType.values()
for (type in types) {
    println(type.chineseName)
}
下面提供另一種應用。筆者在第三節提到「valueOf」方法在無對應物件時，會拋出例外。若讀者想要設計一個類似的方法，
卻不希望發生例外，可以在實作上利用「values」方法。
fun findCurrencyTypeByName(name: String): CurrencyType? {
    for (type in CurrencyType.values()) {
        if (type.name.equals(name, true)) {
            return type
        }
    }
    return null
}
這個範例方法是透過列舉的名稱，以不分大小寫的方式找出對應的物件，且找不到時會回傳null。*/
/*網路參考資料
enum 可以新增普通方法、靜態方法、抽象方法、構造*/

