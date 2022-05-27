package basic

import CraneServiceImpl

// 不支持懒加载
// 不支持传参构造单例
// object 使用 static构造单例，但方法不是静态的
// 单例不可以被继承

// 懒加载
object BasicObject: AbstractBasic() {

    val craneService by lazy { createCraneService() }

    private fun createCraneService(): CraneServiceImpl {
        return CraneServiceImpl()
    }
}