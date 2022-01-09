import java.security.KeyStore

fun main(args: Array<String>) {
    val human = Human()
    val mage = Mage()
    val flag = true
    if (flag == true) {
        mage.attack()
    } else {
        human.attack()
    }
}
open class Human() {
    open val name = String()
    open fun attack() {
        println(" ${name} use Fist Attack!")
    }
}

class Mage(): Human(){
    override val name = String()
    override fun attack(){
        println(" ${name} use Fireball!")
    }
}