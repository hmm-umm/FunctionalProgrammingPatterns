package visitor.old

abstract class ExpressionVisitor {
    internal abstract fun visitIntExp(value: IntExp)
    internal abstract fun visitStringExp(value: StringExp)
//    internal abstract fun visitExpFacade(value: ExpressionFacade)
}