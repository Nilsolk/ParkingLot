@SuppressWarnings("MagicNumber")
fun main() {
    val (rows, cols) = List(3) { readln().split(" ").let { it[0].toInt() to it[1].toInt() } }.unzip()
    val dim = listOf(1, 2, 3, 4, 5)
    println((dim - rows.toSet()).joinToString(" "))
    println((dim - cols.toSet()).joinToString(" "))
}
