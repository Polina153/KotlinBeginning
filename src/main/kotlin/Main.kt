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

    var nullableString: String? = null
    //val nonNullableString: String = nullableString ?:"kotlin"
    //val length: Int = nonNullableString.length
    val length: Int = nullableString?.length ?: 0
    println(length)
    //println(nonNullableString)
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

