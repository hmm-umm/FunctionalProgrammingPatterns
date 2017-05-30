package kotlinex

fun <A,B,C> curry(function: (A,B) -> C): (A) -> (B) -> C {
    return fun (a: A): (B) -> C {
        return fun (b: B): C {
            return function(a, b)
        }
    }
}