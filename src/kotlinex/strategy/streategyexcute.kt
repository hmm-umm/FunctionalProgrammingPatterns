package kotlinex.strategy

import kotlinex.strategy.new.ValidatorFactory
import kotlinex.strategy.old.IsAllLowerCase
import kotlinex.strategy.old.IsNumericCase
import kotlinex.strategy.old.Validator

fun main(args: Array<String>) {
    println("====== old ======")
    var validator: Validator = Validator(IsAllLowerCase())
    val value1: Boolean = validator.validate("aaaaa")
    println("value1 :: ${value1}")
    validator = Validator(IsNumericCase())
    val value2: Boolean = validator.validate("bbb")
    println("value2 :: ${value2}")

    println("====== new ======")
    val value3: Boolean = ValidatorFactory.allLowerValidator("11111")
    println("value3 :: ${value3}")

    val value4: Boolean = ValidatorFactory.numericValidator("11111")
    println("value4 :: ${value4}")
}