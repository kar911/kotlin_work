val g : Int by lazy{ // lazy work with thread and make the variable available called sit
    12        //it is thread safe and can be used as var but require thread to convert
}
fun main() {
    var p=Dumm()
    p.da="21dd2ds"
    println(p.da)
    println(g)
}
class Dumm{
    lateinit var da:String // it is used to set something as not Null u want
    // it cant be val as the compiler has the variable but no value yet
}