import java.util.*
import kotlin.collections.ArrayList

fun main() {
var op=ArrayList<Person>()
    op.add(Person("kar9",18))
    op.add(Person("kar91",13))
    op.add(Person("kar92",15))
    for (i in op){
        println(" AGE : ${ i.age }")
        println(" NAME : ${ i.name }")
    }
    Collections.sort(op)
    for (i in op){
        println(" AGE : ${ i.age }")
        println(" NAME : ${ i.name }")
    }
    println("kar91".compareTo("kar92"))
}
class Person(var name:String,var age :Int):Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return other.name.compareTo(this.name)// if ans is -ve "this < other" and +ve "this > other"
    }
}