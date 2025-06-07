package Day3.Questions

fun main(){
    val day = 2
    val recommendation = when (day) {
        1 -> "Espresso for Monday!"
        2 -> "Latte for Tuesday!"
        3 -> "Mocha for Wednesday!"
        4 -> "Flat white for Thursday!"
        5 -> "Frappe for Friday !"
        6 -> "Cappuccino for saturday!"
        7 -> "Decaf for Sunday!"
        else -> "Invalid day!"
    }
    println(recommendation)
}