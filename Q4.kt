package Day3

fun main() {
    var size1 = "Small"
    var size2 = "Large"
    val temp = size1
    size1 = size2
    size2 = temp
    println("After swapping: size1 = $size1, size2 = $size2")
}
