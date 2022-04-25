fun main() {
    var negativeValue = 0
    var plusValue = 0
    var zeroValue = 0
    repeat(readln().toInt()) {
        when (readln().toInt()) {
            -1 -> negativeValue++
            0 -> zeroValue++
            1 -> plusValue++
        }
    }
    print("$zeroValue $plusValue $negativeValue")
}