fun main() {
    var sum: Long = 1
    for (i in readln().toInt() until readln().toInt()) {
        sum *= i
    }
    print(sum)
}