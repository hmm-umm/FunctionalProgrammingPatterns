package kotlinex.templatemethod.old

class Warrior : Person() {
    override fun prepareWeapon() {
        println("검을 닦습니다")
    }

    override fun prepareArmor() {
        println("갑옷을 입습니다")
    }
}