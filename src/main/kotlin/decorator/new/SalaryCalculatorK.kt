package decorator.new

import decorator.old.Taxes

/**
 * Created by mugku on 2017. 6. 15..
 */
class SalaryCalculatorK {
    val defaultcalculate = { grossAnnual: Double -> grossAnnual / 12}

    val generalApplyTax = { salary: Double -> Taxes.generalTax(salary)}
    val regionalApplyTax = { salary: Double -> Taxes.regionalTax(salary)}
    val healthInsuranceApplyTax = { salary: Double -> Taxes.healthInsuranceTax(salary)}
}

fun defaultcalculateFun(): (value: Double) -> Double {
    return { value: Double -> value / 12 }
}

fun generalApplyTaxFun(): (value: Double) -> Double {
    return { value: Double -> Taxes.generalTax(value) }
}

fun regionalApplyTaxFun(): (value: Double) -> Double {
    return { value: Double -> Taxes.regionalTax(value) }
}

fun healthInsuranceApplyTaxFun(): (value: Double) -> Double {
    return { value: Double -> Taxes.healthInsuranceTax(value) }
}