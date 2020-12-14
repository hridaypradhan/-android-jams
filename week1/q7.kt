fun main() {
    println(factorial(5))
    println(factorial(2))
    println(factorial(4))
    println(factorial(0))
}

fun factorial(number : Int) : Int {
    var answer = 1;
    for(i in 1..number)
    	answer *= i
    return answer
}
