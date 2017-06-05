package visitor.old

abstract class Expression {
    abstract fun accept(v: ExpressionVisitor)
}