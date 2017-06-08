package command.old

class SimpleRemoteControlK<R> {
    fun buttonWasPressed(func: () -> R): Unit {
        func.invoke()
    }
}