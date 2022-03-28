// SCOPE FUNCTION as for { } used for it are having "with,run,also,apply,let"
fun main() {
    val f=Trial()
    with(f){  //with to a function for the intialization/declaration for an object
        d="fsafsf"
        g=1200
    }
    f.cc()
    f.apply{ // its the thing like a function pass with a lambda as in function ff down at 24
        d="fdsd"
        g=12
    }.cc()
    f.cc()
    f.ff{println(it)}
    var d=122
    println(d.toString().toUpperCase())

}
class Trial{
    var d=""
    var g=0
    fun cc(){
    println(this.d)
    println(this.g)
    }
    inline fun ff(action:(Int)->Unit) {
        action(12)
    }
}