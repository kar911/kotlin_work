fun main() {
    var f=gg("212",3)
    var h=fd("dasd",1)
    f.dd()
}
open class gg{
    var ghh:Int=1
    constructor(name:String, age:Int){
        println(name)
        println(age)
        var gh=name
        ghh=123
    }
    constructor()
    open fun dd():Int{
        ghh=134
        return ghh
    }

}
class fd public constructor(name: String, age: Int) : gg() {
    init {
        print("dasdsddsad")
        ghh=21
    }
    override fun dd():Int{
print("fd")
        return 12
    }

}