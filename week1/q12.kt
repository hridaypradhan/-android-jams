fun main() {
    println(checkIfArmstrong(153))
}

fun digits (number : Int) : Int {
    var copy = number
    var answer = 0 
    while (copy > 0) {
        answer++
        copy /= 10
    }
    return answer
}

fun checkIfArmstrong (number : Int) : Boolean {
   	var copy = number
    var numberOfDigits = digits(number)
    var sum = 0.0
    while (copy > 0) {
        sum += (Math.pow((copy % 10).toDouble(), numberOfDigits.toDouble()))
        copy /= 10
    }
    return sum == number.toDouble()
}
