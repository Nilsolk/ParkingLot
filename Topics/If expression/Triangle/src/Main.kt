fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a + b > c && a + c > b && c + b > a) {
        println("YES")
    } else println("NO")
}