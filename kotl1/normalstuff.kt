import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main() {
    for (i in 1..10 step 3){ // step is for the step each skips
        // ".." is equal to rangeTo function
        println(i)
    }
    for (i in 1.rangeTo(10) step 3){ // step is for the step each skips
        // ".." is equal to rangeTo function
        println(i)
    }
    for (i in 10 downTo 1 step 3) {// downTo is for reverse '..' operator
        println(i)
    }

    println("--------------------")
    println(mx(6,3))
println( 32 mx1 21)
    println("kartik " add "moyade")
    val d1=gfff()
    d1.x="good"
    d1.y=12
    val d2=gfff()
    d2.x="iood"
    d2.y=13
 println( d2 avg d1 )
}
class gfff{
    var x:String?=null
    var y:Int?=null
}
fun mx(a:Int,b:Int):Int=if (a>b) a else b
infix fun Int.mx1(b:Int):Int=if (this > b) this else b // infix function are to use as a name to go bet ween
infix fun String.add(b:String):String=this+b // it can be associated to certain datatype and class(also user created)
infix  fun gfff.avg(b:gfff):String{
    val g=compareValues(this.x,b.x)
    val h=compareValues(this.y,b.y)
    return "$g  $h"
}