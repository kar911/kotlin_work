fun main() {
    var ll= listOf<Int>(1,2,4,5,67)
//    for (i in 0..ll.size-1){
//        println(ll[i])
//    }
//    var l2 =ll.filter { it<=5 }
//    for (i in 0..l2.size-1){
//        println(l2[i])
//    }
//    var l3=ll.map { it*10 }
//    for (i in 0..l3.size-1){
//        println(l3[i])
//    }
//    var l4=ll.map { it*10 }.filter { it<=50 }
//    for (i in 0..l4.size-1){
//        println(l4[i])
//    }
    var al=ll.all({ it>10 })
    println(al)
    var ra=ll.any({it>10})
    println(ra)
    var ra1 =ll.count({it>10})
    println(ra1)
    var po=ll.find ({ it>10 })
    println(po)
}