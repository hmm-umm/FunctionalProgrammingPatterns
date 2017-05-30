package kotlinex.templatemethod.new

abstract class PersonK
    (val prepareWeapon : (()-> Unit)?, val prepareArmor: (()-> Unit)?
     , val prepareOther: (()-> Unit)?, val isUsingPrepareOther: Boolean = false) {

    fun readyToBattle(): Unit {
        startBodyTraining()
        prepareWeapon?.invoke()
        prepareArmor?.invoke()

        if(isUsingPrepareOther) {
            prepareOther?.invoke()
        }
    }

    fun startBodyTraining() {
        println("체력 단련 K")
    }
}

