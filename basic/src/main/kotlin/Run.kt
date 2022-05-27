import basic.BasicObject

fun main() {
    val craneService = BasicObject.craneService
    val crane  = craneService.getCrane()
    println("$crane")
    craneService.default()
    craneService.needImpl()
}