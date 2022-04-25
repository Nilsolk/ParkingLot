fun main() {
    val n = readln().toInt()
    val income = MutableList(n) { readln().toDouble() }
    val taxRate = MutableList(n) { readln().toDouble() }
    val tax = MutableList(n) { 0.0 }
    for (i in 0..n - 1) {
        tax[i] = income[i] * taxRate[i]
    }
    println(tax.indexOf(tax.maxOrNull()) + 1)

}