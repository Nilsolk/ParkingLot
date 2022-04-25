fun main() {
    val n = List(readln().toInt()) { readln().toInt() }
    val (p, m) = readln().split(' ').map { it.toInt() }

    val result = if (p in n && m in n) "YES" else "NO"

    println(result)
}