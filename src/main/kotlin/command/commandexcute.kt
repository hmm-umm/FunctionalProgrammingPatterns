package kotlinex.observer

import command.old.*

fun main(args: Array<String>) {

    println("====== old ======")
    val remote: SimpleRemoteControl = SimpleRemoteControl()
    val lightOnCommand: LightOnCommand = LightOnCommand(Light())
    val garageDoorCommand: GarageDoorCommand = GarageDoorCommand(GarageDoor())

    remote.slot = lightOnCommand
    remote.buttonWasPressed()

    remote.slot = garageDoorCommand
    remote.buttonWasPressed()

    println("====== NEW ======")
    val remoteK: SimpleRemoteControlK<Unit> = SimpleRemoteControlK()
    remoteK.buttonWasPressed({println("test ing...")})

}