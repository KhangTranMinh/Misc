import kotlin.math.max

fun findMaxValue(
    weight1: Int, value1: Int,
    weight2: Int, value2: Int,
    maxW: Int
): Int {
    return if (weight1 + weight2 <= maxW) {
        value1 + value2
    } else if (weight1 > maxW && weight2 > maxW) {
        0
    } else if (maxW in weight1..<weight2) {
        value1
    } else if (maxW in weight2..<weight1) {
        value2
    } else {
        max(value1, value2)
    }
}

fun main() {
    var result = findMaxValue(
    	weight1 = 5, value1 = 10,
    	weight2 = 4, value2 = 6,
    	maxW = 8
	  )
    println(result)
    
    result = findMaxValue(
    	weight1 = 5, value1 = 10,
    	weight2 = 4, value2 = 6,
    	maxW = 9
	  )
    println(result)
    
    result = findMaxValue(
    	weight1 = 3, value1 = 5,
    	weight2 = 4, value2 = 7,
    	maxW = 6
	  )
    println(result)
}
