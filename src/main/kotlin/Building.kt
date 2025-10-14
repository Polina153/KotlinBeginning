open class Building() {
    open fun build(){
        println("Building some building")
    }
}

class School : Building(){
    override fun build() {
        super.build()
    }
}