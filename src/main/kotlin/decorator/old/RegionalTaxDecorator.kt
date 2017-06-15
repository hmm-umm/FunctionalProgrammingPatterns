package decorator.old

/**
 * Created by mugku on 2017. 6. 15..
 */
class RegionalTaxDecorator (salaryCalculator: SalaryCalculator) : AbstractTaxDecorator(salaryCalculator) {
    override fun applyTax(salary: Double): Double {
        return Taxes.regionalTax(salary)
    }
}