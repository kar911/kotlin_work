fun main() {
    var name:String?=null //nullable sign ? ->string that is nullable
    println("${name?.length}")
    name?.let{
        println("${name?.length}")
    }
    val l=name?.length ?: -1 //if else for null
//    println("${name!!.length}") // !! is non-null asseretion mean every thing but not null
c.n1="dasdad"
    print(c.n1)
}
object c{
    lateinit var n1:String //dont have to be null other wise u see
}
// lazy  for unsued variable
val p :Int by lazy {
    123
}