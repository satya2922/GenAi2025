package Questions

fun main(){
    var brewStrength = 0
    while (brewStrength < 80) {
        println("Brewing... Strength: $brewStrength")
        brewStrength += 20
    }
    println("Coffee ready at strength: $brewStrength!")

}

