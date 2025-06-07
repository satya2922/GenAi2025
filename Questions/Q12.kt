package Questions

fun main(){
    val coffeePrice = 7.0
    val priceCategory = when {
        coffeePrice < 3 -> "Low-priced delight!"
        coffeePrice in 3.0..6.0 -> "Mid-range magic."
        else -> "Premium beans!"
    }
    println(priceCategory)

}