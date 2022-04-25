fun main() {
    val str = readln()
    var sum = 0
    for (i in str) {
        var k = 0
        for (element in str) {
            if (i == element) k++ else continue
        }
        if (k == 1) sum++
    }
    print(sum)
}