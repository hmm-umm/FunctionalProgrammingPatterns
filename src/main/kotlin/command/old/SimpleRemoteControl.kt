package command.old

class SimpleRemoteControl {
    lateinit var slot: Command
    fun buttonWasPressed() {
        slot?.excute()
    }
}