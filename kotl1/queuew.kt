fun main() {
    var q=queue()
    q.insert(2)
    q.insert(1)
    q.insert(4)
    q.insert(6)
    q.insert(7)
    q.insert(21)
    q.trev()
    println()
q.pop()
    println()
    q.trev()
    println()
    q.pop()
    println()
    q.trev()
}
class queue{
    var cf:MutableList<Int?>?= mutableListOf()
    fun insert(data:Int){
        cf?.add(data)
    }
    fun pop(){
        println(cf?.get(cf!!.size-1))
        cf?.removeAt(cf!!.size-1)
    }
    fun trev(){
        for (i in 0..cf!!.size-1 ){
            cf?.get(i).let {
                println("${ cf!!.get(i) }")
            }
        }
    }
}