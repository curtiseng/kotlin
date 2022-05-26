class CraneEntity(private var id: String) {

    var name: String? = null

    lateinit var type: CraneType

    override fun toString(): String {
        return "{\n\tid=$id\n\tname=$name\n\ttype=$type\n}"
    }
}
