package kotlinex.observer

import decorator.old.*


fun main(args: Array<String>) {

    println("====== old ======")
    val netSalary: Double = HealthInsuranceDecorator(RegionalTaxDecorator(GeneralTaxDecorator(DefaultSalaryCalculator()))).calculate(12000.00)

    val defaultSalary: SalaryCalculator = DefaultSalaryCalculator()
    val generalSalary: SalaryCalculator = GeneralTaxDecorator(defaultSalary)
    val regionalSalary: SalaryCalculator = RegionalTaxDecorator(generalSalary)
    val healthInsurance: SalaryCalculator = HealthInsuranceDecorator(regionalSalary)

    println("====== old ====== :: ${netSalary} ::  ${healthInsurance.calculate(12000.00)}")

    println("====== NEW ======")
//    val netSalary = DefaultSalaryCalculator()
//            .andThen(???({ generalTax() }))
//    .andThen(???({ regionalTax() }))
//    .andThen(???({ healthInsurance() }))
//    .applyAsDouble(30000.00)

    //====
//    public static double calculate(double gross, DoubleUnaryOperator... fs) {
//        return Stream.of( fs )
//                .reduce( DoubleUnaryOperator.identity(),
//                        DoubleUnaryOperator::andThen )
//                .applyAsDouble( gross );
//    }

//    val netSalary = calculate(30000.00,
//            DefaultSalaryCalculator(),
//            ???({ generalTax() }),
//    ???({ regionalTax() }),
//    ???({ healthInsurance() }))

}