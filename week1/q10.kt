fun main() {
    halfPyramid(5)
}

fun halfPyramid(rows : Int) {
    for (i in 1..rows) {
    	for (j in 1..i)
        	print("#")
        println()
    }
}
