package decorator.old

/**
 * Created by mugku on 2017. 6. 15..
 */
class GeneralTaxDecorator (salaryCalculator: SalaryCalculator) : AbstractTaxDecorator(salaryCalculator) {
    override fun applyTax(salary: Double): Double {
        return Taxes.generalTax(salary)
    }
}