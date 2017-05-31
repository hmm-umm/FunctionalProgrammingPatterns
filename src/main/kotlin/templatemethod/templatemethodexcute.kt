package kotlinex.templatemethod

import kotlinex.templatemethod.new.ArcherK
import kotlinex.templatemethod.new.PersonK
import kotlinex.templatemethod.new.WarriorK
import kotlinex.templatemethod.old.Archer
import kotlinex.templatemethod.old.Person
import kotlinex.templatemethod.old.Warrior

fun main(args: Array<String>) {
    println("====== old ======")
    var person: Person = Warrior()
    println("warrior :: ${person.readyToBattle()}")

    person = Archer()
    println("Archer :: ${person.readyToBattle()}")

    println("====== new ======")

    var personK: PersonK = WarriorK()
    println("warrior K :: ${personK.readyToBattle()}")

    personK = ArcherK()
    println("Archer K :: ${personK.readyToBattle()}")
}