fun main() {
    println(loo.d)
    loo.d=12
    loo.mmp()
    println(loo.d)
 }
class loo{
    companion object{
        var d=1212
        fun mmp(){
            println("companion object is for like static purposes")
        }
    }
}