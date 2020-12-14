fun main() {
    println(if (checkDivisibility(56)) "Is divisible" else "Is not divisible")
    println(if (checkDivisibility(55)) "Is divisible" else "Is not divisible")
}


fun checkDivisibility(number : Int) : Boolean {
    return (number % 5 == 0) && (number % 11 == 0)
}
