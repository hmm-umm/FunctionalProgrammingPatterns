package kotlinex.observer

import decorator.new.*
import decorator.old.*
import org.funktionale.composition.andThen


fun main(args: Array<String>) {

    println("====== old ======")
    val netSalary: Double = HealthInsuranceDecorator(RegionalTaxDecorator(GeneralTaxDecorator(DefaultSalaryCalculator()))).calculate(12000.00)

    val defaultSalary: SalaryCalculator = DefaultSalaryCalculator()
    val generalSalary: SalaryCalculator = GeneralTaxDecorator(defaultSalary)
    val regionalSalary: SalaryCalculator = RegionalTaxDecorator(generalSalary)
    val healthInsurance: SalaryCalculator = HealthInsuranceDecorator(regionalSalary)

    println("====== old ====== :: ${netSalary} ::  ${healthInsurance.calculate(12000.00)}")

    println("====== NEW ======")
    val salaryCalculatorK = SalaryCalculatorK()
    val newNetSalary = salaryCalculatorK.defaultcalculate andThen salaryCalculatorK.generalApplyTax andThen salaryCalculatorK.regionalApplyTax andThen salaryCalculatorK.healthInsuranceApplyTax

    println("====== NEW ====== :: ${newNetSalary} ::  ${newNetSalary.invoke(12000.00)}")

    val nNewNetSalary = defaultcalculateFun() andThen generalApplyTaxFun() andThen regionalApplyTaxFun() andThen healthInsuranceApplyTaxFun()
    println("====== nNEW ====== :: ${nNewNetSalary} ::  ${nNewNetSalary.invoke(12000.00)}")

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