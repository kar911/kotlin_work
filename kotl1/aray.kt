
fun main() {
//    var arr = setOf<Int>(3,1,3,4)
//var arr= mutableListOf<Int>(5,12,3,3)
//    arr.removeAt(3)
//    arr.add(1,13)
var arr= mutableMapOf<Int,Int>(0 to dd(),1 to dd1(),2 to dd2())

          for (i in arr.keys){
              println(arr[i])
          }
    var set= setOf<Int>(dd(),dd1(),dd2())
//    for (i in set){
//        println(i)
//    }
    var a1=set.filter { it < 250 }.map { it + 100 }

    for (i in a1){
        println(i)
    }
}
fun dd():Int{
    return 12
}
fun dd1():Int{
    return 22
}
fun dd2():Int{
    return 32
}


