fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    when (productType) {
        "headphones" -> println(Headphones(price).totalPrice())
        "smartphone" -> println(Smartphone(price).totalPrice())
        "tv" -> println(Tv(price).totalPrice())
        "laptop" -> println(Laptop(price).totalPrice())
    }
}

abstract class Product(val price: Int) : TotalPrice

class Headphones(price: Int) : Product(price) {
    override fun totalPrice(): Int {
        return price + price * 11 / 100
    }
}

class Smartphone(price: Int) : Product(price) {
    override fun totalPrice(): Int {
        return price + price * 15 / 100
    }
}

class Tv(price: Int) : Product(price) {
    override fun totalPrice(): Int {
        return price + price * 17 / 100
    }
}

class Laptop(price: Int) : Product(price) {
    override fun totalPrice(): Int {
        return price + price * 19 / 100
    }
}

interface TotalPrice {
    fun totalPrice(): Int
}