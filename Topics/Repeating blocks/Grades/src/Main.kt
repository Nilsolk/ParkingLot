fun main() {
    val x = readln().toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(x) {
        when (readln().toInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }

    print("$d $c $b $a")
}