package command.old

class LightOnCommand(val light: Light): Command {
    override fun excute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}