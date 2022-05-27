class CraneEntity(private var id: String) {

    var name: String? = null

    lateinit var type: CraneType

    override fun toString(): String {
        // Elvis 表达式 if (name != null) name.length else null
        return """
            {
                id = $id,
                name = ${name?.length ?: "null"},
                type = $type
            }
        """.trimIndent()
    }
}
