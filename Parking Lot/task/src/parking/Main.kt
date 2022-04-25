package parking

fun main() = CarList().addCar()


class CarList {
    fun addCar() {
        var carList: MutableList<Car?> = mutableListOf()
        while (true) {
            val information = readln().split(" ").toList()
            when (information[0]) {
                "park" -> park(carList, information)
                "spot_by_reg" -> spot_by_reg(carList, information)
                "spot_by_color" -> spot_by_color(carList, information)
                "reg_by_color" -> reg_by_color(carList, information)
                "leave" -> leave(carList, information)
                "create" -> carList = create(information)
                "status" -> status(carList)
                "exit" -> break

            }
        }
    }

    private fun status(carList: MutableList<Car?>) {
        if (carList.isEmpty()) println("Sorry, a parking lot has not been created.") else {
            if (carList.count { car -> car != null } != 0) {
                for (i in 0 until carList.size) {
                    if (carList[i] != null) {
                        println("${i + 1} ${carList[i]!!.number} ${carList[i]!!.color}")
                    } else continue
                }
            } else println("Parking lot is empty.")
        }
    }

    private fun create(z: List<String>): MutableList<Car?> {
        println("Created a parking lot with ${z[1]} spots.")
        return MutableList(z[1].toInt()) { null }
    }

    private fun reg_by_color(carList: MutableList<Car?>, z: List<String>) {
        if (carList.isEmpty()) {
            println("Sorry, a parking lot has not been created.")
            return
        }
        val list = mutableListOf<String>()
        for (i in carList) {
            if (i != null) {
                if (i.color.lowercase() == z[1].lowercase())
                    list.add(i.number)
            }
        }
        if (list.isEmpty()) {
            println("No cars with color ${z[1].uppercase()} were found.")
        } else {
            println(list.joinToString(", "))
        }
    }

    private fun spot_by_color(carList: MutableList<Car?>, z: List<String>) {
        if (carList.isEmpty()) {
            println("Sorry, a parking lot has not been created.")
            return
        }
        val list = mutableListOf<String>()
        for (i in carList.indices) {
            val car = carList[i]
            if (car != null) {
                if (car.color.lowercase() == z[1].lowercase())
                    list.add((i + 1).toString())
            }
        }
        if (list.isEmpty()) {
            println("No cars with color ${z[1].uppercase()} were found.")
        } else println(list.joinToString(", "))
    }

    private fun spot_by_reg(carList: MutableList<Car?>, z: List<String>) {
        if (carList.isEmpty()) {
            println("Sorry, a parking lot has not been created.")
            return
        }
        var x = -1
        for (i in carList.indices) {
            val car = carList[i]
            if (car != null) {
                if (car.number == z[1])
                    x = i + 1
            }
        }
        if (x != -1) {
            println(x)
        } else println("No cars with registration number ${z[1].uppercase()} were found.")
    }

    private fun park(carList: MutableList<Car?>, z: List<String>) {

        if (carList.isEmpty()) {
            println("Sorry, a parking lot has not been created.")
            return
        }
        val car = Car(z[1], z[2])
        val firstFreeSpot = carList.indexOfFirst { car -> car == null }
        if (firstFreeSpot < 0) println("Sorry, the parking lot is full.") else {
            carList[firstFreeSpot] = car
            println("${car.color} car parked in spot ${firstFreeSpot + 1}.")
        }
    }

    private fun leave(carList: MutableList<Car?>, z: List<String>) {
        if (carList.isEmpty()) {
            println("Sorry, a parking lot has not been created.")
            return
        }
        if (carList[z[1].toInt() - 1] == null) {
            println("Spot ${z[1]} is free.")
        } else {
            carList[z[1].toInt() - 1] = null
            println("Spot ${z[1]} is free.")
        }

    }
}


data class Car(val number: String, val color: String)