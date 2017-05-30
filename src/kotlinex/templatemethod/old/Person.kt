package kotlinex.templatemethod.old

abstract class Person {
    fun readyToBattle(): Unit {
        startBodyTraining()
        prepareWeapon()
        prepareArmor()

        if(isUsingPrepareOther()) {
            prepareOther()
        }
    }

    fun startBodyTraining() {
        println("체력 단련")
    }

    abstract fun prepareWeapon()
    abstract fun prepareArmor()
    open fun isUsingPrepareOther(): Boolean {
        return false
    }
    open fun prepareOther(){}
}