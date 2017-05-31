package kotlinex.chainofresponsibility

import kotlinex.chainofresponsibility.old.HanderTextProcessing
import kotlinex.chainofresponsibility.old.ProcessingObject
import kotlinex.chainofresponsibility.old.SpellCheckerProcessiong
import org.funktionale.composition.andThen

fun main(args: Array<String>) {
    println("====== old ======")
    val processing1: ProcessingObject<String> = HanderTextProcessing()
    val processing2: ProcessingObject<String> = SpellCheckerProcessiong()
    processing1.setSuccesor(processing2)
    println("processing1 :: ${processing1.handle("Aren't labdas really sexy?!!")}")


    println("====== new ======")
    val headerProcessing = {value: String -> "From Raoul, Mario and Alan: ${value}"}
    val spellCheckerProcessing = {value: String -> value.replace("labda", "labmda")}
    val pipline = headerProcessing.andThen(spellCheckerProcessing)
    println("pipline ${pipline("Aren't labdas really sexy?!!")}")
}