fun main() {
    val x = readln()
    val k = when (readln()) {
        "equals" -> x == readln()
        "plus" -> x + readln()
        "endsWith" -> x.endsWith(readln())
        else -> "Unknown operation"

    }
    print(k)
}