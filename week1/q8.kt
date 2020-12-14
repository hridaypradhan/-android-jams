fun main() {
    println(sumOfFactorials(3))
}

fun factorial(number : Int) : Int {
    var answer = 1;
    for(i in 1..number)
    	answer *= i
    return answer
}

fun sumOfFactorials(number : Int) : Int {
    var answer = 0
    for(i in 1..number)
    	answer += factorial(i)
    return answer
}
