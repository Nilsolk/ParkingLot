fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    var sum = 0;
    for (i in x..y) {
        if (i % z == 0) {
            sum++
        }
    }
    println(sum)
}