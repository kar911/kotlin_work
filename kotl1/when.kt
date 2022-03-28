fun main() {
    val d='d'
    var f=212.2
    var g= 212.2F
    val gg1=false
    print(gg1)
when(d){
    'e'->{
        print("eho de puta")}
    else->{
        print("go")
    }
}
    val ff= Array<Int>(5){0} // default array for kotlin fixed
    val gg=ArrayList<String>()
    gg.add("dasd1")
    gg.add("dasd12")
    gg.add("dasd13")
    gg.add("dasd14")
    gg.add("dasd15")
    gg.add("dasd16")
    if ("dasdsa".contains("da")){
        print(true)
    }
    else{
        print(false)
    }
    for (i in 0..4){
        ff[i]=i
    }
    for (i in ff){
        println(i)
    }
}