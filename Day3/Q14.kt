package Day3

fun main(){
    val temperature = 70
    val tempStatus = when {
        temperature < 50 -> "Too Cold"
        temperature in 50..75 -> "Perfect"
        else -> "Too Hot"
    }
    println("Coffee temp: $tempStatus")

}