fun main() {
    val numbers = MutableList(readln().toInt()) { readln().toInt() }
    val x = readln().toInt()
    var sum = 0
    for (i in numbers) {
        if (i == x) sum++
    }
    println(sum)
}