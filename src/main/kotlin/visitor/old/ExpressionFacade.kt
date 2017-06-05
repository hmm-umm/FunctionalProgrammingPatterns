package visitor.old

class ExpressionFacade: Expression() {
    override fun accept(v: ExpressionVisitor) {
        val exp1: Expression = IntExp()
        exp1.accept(v)
        val exp2: Expression = StringExp()
        exp2.accept(v)
    }
}