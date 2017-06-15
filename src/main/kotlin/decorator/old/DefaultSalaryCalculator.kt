package decorator.old

/**
 * Created by mugku on 2017. 6. 15..
 */
class DefaultSalaryCalculator : SalaryCalculator{
    override fun calculate(grossAnnual: Double): Double {
        return grossAnnual / 12
    }
}