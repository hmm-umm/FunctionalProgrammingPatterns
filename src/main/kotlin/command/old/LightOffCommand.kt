package command.old

class LightOffCommand(val light: Light): Command {
    override fun excute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}