package visitor.old

class IntExp: Expression() {
    val intExpValue: Int = 1
    override fun accept(v: ExpressionVisitor) {
        v.visitIntExp(this)
    }
}