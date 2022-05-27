fun add(a: Int, b: Int): Int {
    return a + b
}

fun multi(a: Int, b: Int): Int {
    return a * b
}

class CC(private var a: Int, private var b: Int) {

    fun cc(func: (Int, Int) -> Int) {
        println(func.invoke(a, b))
    }
}


fun main() {
    val num: (Int, Int) -> Int = { a, b -> add(a, b) }
    println(num(1, 2))
    val cc = CC(1, 2)
    cc.cc { a, b -> add(a, b) }
    cc.cc(::add)
    cc.cc(::multi)
}