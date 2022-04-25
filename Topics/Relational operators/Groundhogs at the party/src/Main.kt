fun main() {
    val x = readln().toInt()
    val y = readln().toBoolean()

    println((!y && x in 10..20) || (y && x in 15..25))
}