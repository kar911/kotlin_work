fun main(){
    var dff=df()
    var h= readLine()!!.toInt()
    dff.summ(h as Int?)
    dff.summ(h)
}
class df{
    fun summ(da:Int):Int{
        print("error")
        return da
    }
    fun summ(da:Int?):Int?{
        print("good")
    var g=da
        return g
    }
}