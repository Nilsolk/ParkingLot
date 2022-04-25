fun main() {
    val x: MutableList<Int> = mutableListOf()
    do {
        val z = readln().toInt()
        x.add(z)
    } while (z != 0)

    print(x.maxOrNull())
}
