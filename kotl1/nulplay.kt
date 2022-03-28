import java.math.BigInteger

fun main() {
//    print(12 add1 13)
//    print(mul(BigInteger("13"), BigInteger("13"),9999))
    var ff=d2()
    print(d2.name)
    print(d2.roll)
//    print(si1.roll)
//    si1.name="dsadsads"
//    print(si1.name)
}

infix fun Int.add1(oth:Int):Int{
    return this+oth
}
 tailrec fun mul(fi:BigInteger, oth: BigInteger, n:Int): BigInteger {
    if (n==0)
        return fi
    else
        return mul(fi+oth,oth+fi,n-1)
}
class d2{
    companion object { // static for a class
        val roll:Int=1121
        var name:String="11eaxe"
    }
}

object si1{//static is independent si1.roll etc
    val roll:Int=12121
    var name:String="xeaxe"
}
