package kotlinex.observer

import visitor.old.ExcuteExpressionVisitor
import visitor.old.ExpressionFacade

fun main(args: Array<String>) {

    println("====== old ======")
    val exp: ExpressionFacade = ExpressionFacade()
    exp.accept(ExcuteExpressionVisitor())

    println("====== NEW ======")

}