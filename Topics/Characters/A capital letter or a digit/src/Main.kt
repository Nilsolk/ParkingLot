fun main() {
    val x = readln().first()
    val isDigit = x in '\u0031'..'\u0039'
    println(isDigit || x.isUpperCase())

}
