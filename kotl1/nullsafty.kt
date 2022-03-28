fun main() {
    val d:String?="null"  //  the ? is for declaring it as nullable (can be nullified)


/*1*/ println(d?.length) // used to pass a nullable value in the variable that not give exception


/*2*/ //   println(d!!.length) //used to assure that given variable must be not Nullable  it contain something


/*3*/    println(d?.length ?: "its null") // its like it give  the defined value if the variable is null it can be String an other


/*4*/ d?.let {  // let block is used for doing some thing in the block if the variable is not null
     println("fsddsfdf"+it) //it is the refference for current object of string
 }
    d?.run { //run is said to be combination of let as it handle the exception and declare the objec also
        println("fsddsfdf"+this) //it is the refference for current object of string
    }
}