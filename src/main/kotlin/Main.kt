import java.util.Scanner

/*fun main() {
    *//*print("Hello World!")
    var a = 5
    println(a)*//*

    val scanner = Scanner(System.`in`)
    println("Введите температуру в градусах Фаренгейта:")
    val fahrenheit = scanner.nextDouble()
    val celsius = (fahrenheit - 32) / 1.8

    val weatherDescription = when{
        celsius < 10 -> "Очень холодно"
        celsius in 10.0..20.0 -> "Прохладно"
        celsius in 20.0..30.0 -> "Тепло"
        else -> "Жарко"
    }

    println("Температура в Цельсиях: %.1f°C".format(celsius))
    println("Погода на улице: $weatherDescription")
}*/

fun main() {


    // LET
/*    var nullableName: String? = "Kotlin"

    nullableName?.length

    nullableName?.let {
        it.length
        println("Привет, $it!") // Выводится только если nullableName не null
    }

    val list = mutableListOf<Int>()

    list.also {
        println("Список до добавления: $it")
    }.add(10)

    println("Список после добавления: $list")*/

    //RUN
    /*fun main() {
        val rectangle = Rectangle(width = 10, height = 5)

        val area = rectangle.run {
            width * height
        }

        val area2 = rectangle.width * rectangle.height

        println("Площадь прямоугольника: $area")

    }

    data class Rectangle(val width: Int, val height:Int)
*/

    //WITH
    /*const val PI = 3.14

    fun main() {
        val circle = Circle(radius = 7)

        val rectangle = Rectangle(width = 10, height = 5)

        val perimeter = with(circle) {
            PI * radius * 2
        }

        with(rectangle){
            width*=2
            height *=3
            println("Rectangle width = $width and height = $height")
        }

        println("Длина окружности: $perimeter")

    }

    data class Rectangle(var width: Int, var height:Int)
    data class Circle(val radius: Int)*/


    //APPLY
    /*fun main() {
        val builder = StringBuilder()

        builder.apply {
            append("Привет, ")
            append("мир!")
            append(" Hello ")
            append("world!")
            append(" Hi, ")
            append("hi!")
        }

        println(builder)

    }
    */


    /*val animal1 = Animal("Mursik")
    val animal2 = Animal("Tusik", 4)
    println(animal1.name)*/
    /*val cat = Cat("Barsik", 105)
    val plate = Plate(0)
    plate.info()
    cat.printInfo()
    cat.eat(plate)
    plate.info()
    cat.printInfo()
    plate.increaseFood(200)
    plate.info()
    cat.printInfo()
    cat.eat(plate)
    plate.info()
    cat.printInfo()
    val dog = Dog("Tusik")
    dog.guard()*/

    /*val numbers = arrayOf(1, 2, 3, 4, 5)
    for (num in numbers){
        if(num %2 == 0) println("Element $num")
    }
    for (i in 1..5){
        println("$i ")
    }
    for (i in 5 downTo 0){
        print("$i ")
    }*/
    /*    val age = -60
        if(age > 18){
            println("You can vote")
        } else {
            println("You are too young for voting")
        }*/
    /* var index = 1
     while (index <= 5) {
         println("$index ")
         index++
     }
     do {
         println("Do-while $index ")
         index++
     } while (index <= 5)*/
    /*var nullableString: String? = "kotlin"
    val length: Int? = nullableString?.length
    println(length)*/

    /*var nullableString: String? = null
    //val nonNullableString: String = nullableString ?:"kotlin"
    //val length: Int = nonNullableString.length
    val length: Int = nullableString?.length ?: 0
    println(length)
    //println(nonNullableString)*/
}
/*    val temperatureInFahrenheit: Double = getTemperatureFromUser()
    val temperatureInCelsius = convertFahrenheitToCelsius(temperatureInFahrenheit)
    val description = determineWeather(temperatureInCelsius)

    println("Температура в Цельсиях: %.1f°C".format(temperatureInCelsius))
    println("Погода на улице: $description")
}

fun getTemperatureFromUser(): Double {
    val scanner = Scanner(System.`in`)
    println("Введите температуру в градусах Фаренгейта:")
    return scanner.nextDouble()
}

fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) / 1.8
}

fun determineWeather(celsius: Double): String {
    return when {
        celsius < 10 -> "Очень холодно"
        celsius in 10.0..20.0 -> "Прохладно"
        celsius in 20.0..30.0 -> "Тепло"
        else -> "Жарко"
    }
}*/

/*//Задача
//Пользователь вводит температуру в градусах Фаренгейта.
Программа конвертирует её в градусы Цельсия и затем сообщает,
какова погода:
//
//Если температура менее 10°C — «Очень холодно».
//Если температура от 10°C до 20°C — «Прохладно».
//Если температура от 20°C до 30°C — «Тепло».
//Если температура превышает 30°C — «Жарко».*/

