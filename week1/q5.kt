fun main() {
    whatKindOfTriangle(1,1,1)
    whatKindOfTriangle(1,2,1)
    whatKindOfTriangle(1,2,3)
}


fun whatKindOfTriangle(side1 : Int, side2 : Int, side3 : Int) {
    var equalSides = 0
    if(side1 == side2)
    	equalSides++
    if(side1 == side3)
    	equalSides++
    if(side2 == side3)
    	equalSides++
    when(equalSides) {
        0 -> println("Scalene")
        1 -> println("Isosceles")
        3 -> println("Equilateral")
    }
}
