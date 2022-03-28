fun main(){
    var f=dad()
    f.make(123,"dad",321)
    f.show()
    var c=child(f,"son",1222)
    c.show()
    var c1=child(f,"son1",1221) as dad
    c1.make(100,"c2",10)
    println("         /")
    c1.show()
    println("         /")
    var c11=child(c1,"c112",11001)
    c11.show()
}
open class dad(){
    var name: String=""
    var age:Int=1
    var num:Int?=null
    fun make(num:Int,name: String,age:Int){
        this.num=num
        this.name=name
        this.age=age
    }
    open fun show(){
        println(this.num)
    }
}
class child(var ff: dad,var names: String,var roll:Int) : dad() {

    override fun show(){
        println("father name = ${ff.name}")
        println("father age = ${ff.age}")
        println("son name = ${names}")
        println("son roll = ${roll}")
    }
}
