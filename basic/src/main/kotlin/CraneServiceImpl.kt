import basic.AbstractBasic

// 不支持懒加载
// 不支持传参构造单例
// object 使用 static构造单例，但方法不是静态的
open class CraneServiceImpl: AbstractBasic() {

    fun getCrane(): CraneEntity {
        val crane = CraneEntity(id = "1")
        crane.type = CraneType(code = "10", type = "10")
        return crane
    }
}