fun main() {
    val n = readln().toInt()
    var count = 0
    var i = 1
    while (count < n) {
        for (j in 0 until i) {
            print("$i ")
            if (++count == n) {
                break
            }
        }
        i++
    }
}