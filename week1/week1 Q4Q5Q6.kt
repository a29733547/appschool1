/*// week1 Q4 Q5
open class Human(val name:String){
    var damage : Int = 0
    constructor(name: String, damage: Int) : this(name) {
        this.damage = damage
    }
    open fun Attack(){
        println("${name} passedin ${damage} damage")
    }
}

class Mage : Human {
    //constructor(name: String) : super(name)
    constructor(name: String, damage: Int) : super(name, damage)
    override fun Attack(){
        println("${name} FireBall ${damage} damage")
    }
}

fun main(args: Array<String>){
    val human = Human("N1", 50)
    human.Attack()
    val mage =  Mage("N2", 999)
    mage.Attack()
}*/

//weekQ4~6
open class Human(val name:String){
    var damage : Int = 0
    var mp : Int = 0
    constructor(name: String, damage: Int, mp: Int) : this(name) {
        this.damage = damage
        this.mp = mp
    }
    open fun Attack(){
        println("${name} passedin ${damage} damage")
        if (mp > 0) {println("MAX Mana")} else {println("${mp} mana")}
    }
}


class Mage : Human{
    constructor(name: String, damage: Int, mp: Int) : super(name, damage, mp)
    override fun Attack(){
        println("${name} FireBall ${damage} damage")
        if (mp > 0) {println("MAX Mana")} else {println("${mp} mana")}
    }
}

fun main(args: Array<String>){
    val human = Human("N1", 50, 0)
    human.Attack()
    val mage = Mage("N2", 999, 100)
    mage.Attack()

}


