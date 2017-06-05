package visitor.old

class ExcuteExpressionVisitor: ExpressionVisitor() {
    override fun visitIntExp(value: IntExp) {
        println("ExcuteExpressionVisitor :: visitIntExp :: ${value.intExpValue}")
    }

    override fun visitStringExp(value: StringExp) {
        println("ExcuteExpressionVisitor :: visitStringExp :: ${value.stringExpValue}")
    }

//    override fun visitExpFacade(value: ExpressionFacade) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
}