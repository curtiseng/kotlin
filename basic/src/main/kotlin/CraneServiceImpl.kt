class CraneServiceImpl: BaseServiceImpl() {

    fun getCrane() {
        val crane = CraneEntity(id = "1")
        crane.type = CraneType(code = "10", type = "10")
        println("$crane")
    }
}