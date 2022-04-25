fun main() {
    var a = 10

    when (a) {
        in 1..22 -> print("Ok")

        a + a -> print("Ok")

        in 1..20 -> print("Ok"); print("Ok")

        "2" -> print("Ok")

            > 0 -> print("Ok")

        11, 12 -> print("Ok")
    }
