class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate() {
        speed += 5
    }

    fun decelerate() {
        if (speed - 5 > -1) {
            speed -= 5
        } else speed = 0
    }


}
