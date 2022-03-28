fun main() {
    var ss=ab()
    with(ss){
        name1="kartik"
        roll1=121
    }
    var ss1=ab()
    ss1.apply {
        name1="kartikearth"
        roll1=19
    }.show(object :op{
        override fun showinfun(nn: Int) {
            println("this is the message to using apply show $nn")
        }
    })
    println(ss.name1)
    println(ss.roll1)
    ss.show(object :op{
        override fun showinfun(nn: Int) {
            println("this is the message to show $nn")
        }
    })
//    var lam={s:Int-> print(s+100000)}
    ss.show1({it+100000})
    var peep= listOf<ab>(ab("asdsa",10),ab("asdsa1",101),ab("asdsa2",102))
    var k9=peep.filter { it.roll1>100 }.map { it.name1 }
    for (i in 0..k9.size-1){
        println(k9[i])
    }
}
interface op{
    fun showinfun(nn:Int)
}
class ab(var name1:String="",
         var roll1:Int=0){


    fun show(action: op){// highlevel fuction using interface
        action.showinfun(113)
    }
    fun show1(fu:(Int)->Int){
        print(fu(139))
    }
}