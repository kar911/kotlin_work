import java.util.HashMap
import kotlin.reflect.jvm.internal.pcollections.HashPMap

fun main(arg:Array<String>) {
    print("enter the name : ")
    val nm= readLine()
    print("enter the age : ")
    val age= readLine()!!.toInt()
    var ad=asd(nm,age)
    ad.kar()
    val hm= hashMapOf("dasdsad" to 12)
    println(hm["dasdsad"])
    hm.put("dd",22)
    println(hm.get("dd"))
    var  c=hm.clone() as HashMap<String,Int>
    c.put("dasd",1222)
  print(c)
}
class asd(var name :String?,var age:Int?) {
    fun kar() {
        println(this.name)
        println(this.age)
    }
}