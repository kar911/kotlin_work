//data class ddd(var f:String, var g :Int=12){
//
//}

fun main() {
//    var d= ddd("asdsad")
//    var d1= ddd("asdsad")
//    var df=d1.copy(g=12)
//    var b = d==d1
//    print(b)
//    println(df)
//    print(o1.lam(1 ,2))
    var fg=d()
    fg.ca(110,{it+12})

}
//object o1{
//    var l=1
//    var g="dasdadasd"
//    var lam: (Int,Int) -> String ={roll:Int,cla:Int ->roll.toString()+cla.toString()}
//}

class d{
    fun ca(st:Int,k:(Int)->Int){
 print(k(st))
}
}