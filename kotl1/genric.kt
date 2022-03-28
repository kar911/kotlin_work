fun main() {
var d =unknownType("Str",0b1_0_1_1_1)// under score are for readablity
    var f=unknownType(0x1_4,12)
    var g=unknownType(1F,1)// kotlin dont support octal numbers
println(m2("dasdasdasasdsadsa"))
//    d.m3()
}
fun<g> m2(ink:g):g{ //genric for function the <T> is to define T and in assigning ink:T is to use
    var Id:g=ink
    return Id
}
class unknownType<F,T>(dontKnow:F,ff:T){
    init {
        println("$dontKnow   $ff")
    }
}