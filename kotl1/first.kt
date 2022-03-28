@file:JvmName("FirstKt")

import javax.print.attribute.standard.MediaSize

fun main(args : Array<String>){
    var sd = "dsadsa"
    for ( i in -3..5){
        println("$i  ${sd} ")
    }
    var d=10
    var c =when(d){
        10->"good"
        else->"bad"
    }
    print(c)
    var x=12
    print(x.add(10))
    var ff=c2("kart")
    ff.main1("dsad")
    println(ff.n2)

    fun Int.addd(m:Int):Int=  this+m
    println(2.addd(231))
}
@JvmOverloads
fun s(i :String ="fdsf"){
    var d=1
    var c =when(d){
        10->"good"
        else->"bad"
    }
    print(c + i)
}
infix fun Int.add(other: Int):Boolean{
    return other < this
}
open class  c1(var n:String){
    var s:String=""
    open fun main1(sp:String){
        this.s=sp
    }

}
class c2(var n1:String) : c1(n1) {
    var n2=""
    override fun main1(sp: String) {
        this.n2=sp+"c2"
        for (i in 10 downTo 1){
            print("$n2$i -> $i ")
        }
    }
}