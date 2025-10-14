class Dog(name: String) : Animal(name), Guardian {
    override fun guard() {
        barking()
    }


}