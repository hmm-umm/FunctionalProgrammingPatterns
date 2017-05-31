package kotlinex.flyweight

import kotlinex.flyweight.new.CompFactoryK
import kotlinex.flyweight.old.Assignedcoumpter
import kotlinex.flyweight.old.CompFactory

fun main(args: Array<String>) {
    println("====== old ======")
    var bobComputer: Assignedcoumpter = Assignedcoumpter(CompFactory.instance.ofType("macbook"), "bob")
    println("bobComputer :: ${bobComputer}")
    var steveComputer: Assignedcoumpter = Assignedcoumpter(CompFactory.instance.ofType("sun"), "steve")
    println("steveComputer :: ${steveComputer}")

    println("====== new ======")

    var bobComputerK: Assignedcoumpter = Assignedcoumpter(CompFactoryK.instance.computerOfType("macbook"), "bob")
    println("bobComputerK :: ${bobComputerK}")
    var steveComputerK: Assignedcoumpter = Assignedcoumpter(CompFactoryK.instance.computerOfType("sun"), "steve")
    println("steveComputerK :: ${steveComputerK}")
}