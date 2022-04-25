fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var startPrice = 20000
    repeat(old) {
        startPrice -= 2000
    }
    startPrice -= kilometers / 10_000 * 200
    startPrice -= (120 - maximumSpeed) * 100
    if (automatic == true) {
        startPrice += 1500
    }
    println(startPrice)
}