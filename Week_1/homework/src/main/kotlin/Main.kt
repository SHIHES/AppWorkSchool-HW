fun main() {
    Human("Steven",30).manacheck()
    Human("Steven", 20).attack()
}
open class Human(var name: String, var mana: Int) {
    open var yesNo: Boolean = mana <= 0

    open fun manacheck() {
        if (yesNo) {
            println("Oh no! You don't have the mana!!")
        } else {
            println("You have the mana!!")
        }
    }
    open fun attack() {
        println(" $name use Fist Attack!")
    }
}
class Mage (name: String, mana: Int): Human(name, mana){
    override fun attack() {
            println("$name use fire ball!")
    }
}

