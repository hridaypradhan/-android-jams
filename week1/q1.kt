fun main() {
    println(checkNumber())
}

fun checkNumber(number : Int = 0) {
    if(number>0)
    	println("Positive")
    else if(number<0)
    	println("Negative")
}
