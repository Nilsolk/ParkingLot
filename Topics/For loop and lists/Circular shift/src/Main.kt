fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    list.add(0, list[list.lastIndex])
    list.removeAt(list.lastIndex)
    println(list.joinToString(" "))
}
