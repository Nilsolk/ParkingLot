fun main() {
    val x = readln().toInt()
    var i = 1
    while (i * i <= x) {
        println(i * i)
        i++
    }
}