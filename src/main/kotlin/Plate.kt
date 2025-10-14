class Plate(internal var food: Int) {

    fun decreaseFood(n: Int) {
        food -= n
    }

    fun info() {
        println("plate: $food")
    }

    fun increaseFood(n: Int) {
        food += n
    }
}