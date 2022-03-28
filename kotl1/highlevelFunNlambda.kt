fun main() {
val c=C1()
    c.cf1(14,object :INter{         // using static instance through object but it from abstract interface
        override var x: Int?= 78
        override fun inf() {
            println("form the interface use$x")
        }
    })
    c.cf2(2) { s -> println("dasdad$s ")}
    c.cf3(3) { print(it)}  // 'IT' reffers to the single argument passed in the lambda
}
class C1{
    fun cf1(ins :Int ,action: INter){
        println(ins)
        action.inf()
    }
    fun cf2(ins :Int ,ac: (Int) -> Unit){
        ac(94+ins)
    }
    fun cf3(ins :Int ,ac: (Int) -> Unit){
        ac(9323+ins)
    }
}
interface  INter{
    var x: Int?
    fun inf()
}