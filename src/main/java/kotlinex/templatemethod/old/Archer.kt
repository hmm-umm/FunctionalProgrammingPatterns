package kotlinex.templatemethod.old

class Archer : Person() {
    override fun prepareWeapon() {
        println("활을 닦습니다")
    }

    override fun prepareArmor() {
    }

    override fun isUsingPrepareOther(): Boolean {
        return true;
    }

    override fun prepareOther() {
        println("화살을 준비합니다")
    }
}