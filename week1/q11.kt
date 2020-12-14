fun main() {
    println(checkIfArmstrong(370))
}

fun cube (number : Int) : Int {
    return number * number * number
}

fun checkIfArmstrong (number : Int) : Boolean {
   	var copy = number
    var sum = 0
    while (copy > 0) {
        sum += (cube(copy % 10))
        copy /= 10
    }
    return sum == number
}
