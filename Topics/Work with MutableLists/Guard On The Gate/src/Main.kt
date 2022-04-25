fun main() {
    val backFromTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    backFromTheWall.add(returnedWatchman)
    print(backFromTheWall.joinToString())
    // write your code here   

}