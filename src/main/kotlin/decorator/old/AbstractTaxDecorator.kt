package decorator.old

/**
 * Created by mugku on 2017. 6. 15..
 */
abstract class AbstractTaxDecorator (val salaryCalculator: SalaryCalculator) : SalaryCalculator{
    override fun calculate(grossAnnual: Double): Double {
        val salary: Double = salaryCalculator.calculate(grossAnnual)
        return applyTax(salary)
    }

    abstract fun applyTax(salary: Double): Double
}