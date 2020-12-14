fun main() {
    println(isAlphabet('a'))
    println(isAlphabet('A'))
    println(isAlphabet('5'))
}

fun isAlphabet(character : Char) : Boolean {
    return character in 'a'..'z' || character in 'A'..'Z'
}
