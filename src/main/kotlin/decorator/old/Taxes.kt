
package decorator.old

class Taxes {
    companion object {
        fun generalTax(salary: Double): Double {
            return salary * 0.8
        }

        fun regionalTax(salary: Double): Double {
            return salary * 0.95
        }

        fun healthInsuranceTax(salary: Double): Double {
            return salary - 200.0
        }
    }
}