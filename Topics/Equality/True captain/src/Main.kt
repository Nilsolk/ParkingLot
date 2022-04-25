
class Pirate(name: String) {
    var name: String = name
        private set
}

fun main() {
    var captain = Pirate("Hector Barbossa")
    println(captain.name)
    // Do not touch the lines above
    val newCaptain = Pirate("Jack Sparrow")
    captain = newCaptain
    println(captain.name)
}