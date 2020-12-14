fun main() {
    println(checkNumber(5))
    println(checkNumber(-5))
}

fun checkNumber(number : Int = 0) {
    if(number > 0)
    	println("It is positive")
    else if(number < 0)
    	println("It is negative")
}
