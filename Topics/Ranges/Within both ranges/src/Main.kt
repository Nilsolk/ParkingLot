fun main() {
    val range = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val x = readln().toInt()

    println(x in range && x in range2)
}