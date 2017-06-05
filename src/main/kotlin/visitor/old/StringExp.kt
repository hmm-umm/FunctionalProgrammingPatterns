package visitor.old

class StringExp: Expression() {
    val stringExpValue: String = "StringExp"
    override fun accept(v: ExpressionVisitor) {
        v.visitStringExp(this)
    }
}