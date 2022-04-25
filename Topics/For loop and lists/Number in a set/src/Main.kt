fun main() {
    val numbers = MutableList(readln().toInt()) { readln().toInt() }
    val x = readln().toInt()
    var num = 0
    for (i in numbers) {
        if (i == x) num++
    }
    val str = if (num > 0) "YES" else "NO"

    println(str)
}