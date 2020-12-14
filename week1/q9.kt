fun main() {
    println(sumOfEven(10))
}

fun sumOfEven(number : Int) : Int {
    var answer = 0
    for (i in 2..number)
    	if(i % 2 == 0)
        	answer += i
    return answer
}
