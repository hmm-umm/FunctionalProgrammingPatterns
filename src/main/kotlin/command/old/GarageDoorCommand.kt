package command.old

class GarageDoorCommand(val garageDoor: GarageDoor): Command {
    override fun excute() {
        garageDoor.up()
    }

    override fun undo() {
        garageDoor.down()
    }
}