class Cat(name: String, private var appetite: Int) : Animal(name) {
    private var isHungry = appetite > 0

    init {
        println("Cat is here")
    }

    fun eat(p: Plate) {
        if (isHungry) {
            if (p.food > 0) {
                while (appetite > 0 && p.food > 0) {
                    p.decreaseFood(1)
                    appetite--
                }
                if (appetite == 0) {
                    isHungry = false
                }
            } else {
                println("Sorry, no food in plate!")
            }
        } else {
            println("Cat $name isn't hungry")
        }
    }

    fun printInfo() {
        println("$name has appetite: $appetite and is hungry: $isHungry")
    }
}