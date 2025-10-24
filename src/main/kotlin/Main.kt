/*fun divideByThree(value: Int) {
    if (value % 3 != 0) {
        throw IllegalArgumentException("$value не делится нацело на 3")
    }
    println("$value делится на 3")
}

fun main() {
    try {
        divideByThree(10) // Вызовет исключение
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        divideByThree(9) // Нормальное выполнение
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}*/

/*
class DivisionByZeroException(message: String) : ArithmeticException(message)

fun divide(a: Int, b: Int): Double {
    if (b == 0) {
        throw DivisionByZeroException("Делить на ноль нельзя!")
    }
    return a.toDouble() / b
}

fun main() {
    try {
        println(divide(10, 0)) // Вызовет наше исключение
    } catch (e: DivisionByZeroException) {
        println(e.message)
    }

    try {
        println(divide(10, 2)) // Нормальное выполнение
    } catch (e: DivisionByZeroException) {
        println(e.message)
    }
}
*/

/*
class Car
class Truck
class Motorcycle

class CarPark<T> {
    private val cars = mutableListOf<T>()

    fun park(car: T) {
        cars.add(car)
    }

    fun countCars(): Int {
        return cars.size
    }

    fun cars(): List<T> {
        return cars
    }
}

// Пример использования:
fun main() {
    val parkingLot = CarPark<Car>()
    parkingLot.park(Car())
    parkingLot.park(Car())
    println(parkingLot.countCars()) // Output: 2
    println(parkingLot.cars()) // Output: [Car, Car]

    val truckParking = CarPark<Truck>()
    truckParking.park(Truck())
    println(truckParking.countCars()) // Output: 1
}
*/

/*// Базовый класс транспортного средства
open class Vehicle

// Конкретные транспортные средства
class Car : Vehicle()
class Truck : Vehicle()
class Motorcycle : Vehicle()

// Каркас парковки, принимающий транспортное средство любого типа
class CarPark<in T : Vehicle> {
    private val vehicles = mutableListOf<T>()

    // Добавляем транспорт в парковку
    fun park(vehicle: T) {
        vehicles.add(vehicle)
    }

    // Количество припаркованных транспортных средств
    fun countVehicles(): Int {
        return vehicles.size
    }

    // Возвращает список припаркованных транспортных средств (covariant)
    fun vehicles(): List<@UnsafeVariance T> {
        return vehicles
    }
}*/

// Пример использования:
fun main() {
/*    // Создаем парковку для легковых автомобилей
    val carParking = CarPark<Car>()
    carParking.park(Car())
    carParking.park(Car())
    println(carParking.countVehicles()) // Output: 2
    println(carParking.vehicles()) // Output: [Car, Car]

    // Создаем парковку для грузовых автомобилей
    val truckParking = CarPark<Truck>()
    truckParking.park(Truck())
    println(truckParking.countVehicles()) // Output: 1
    println(truckParking.vehicles()) // Output: [Truck]

    // Универсальная парковка, принимающая любые транспортные средства
    val universalParking = CarPark<Vehicle>()
    universalParking.park(Car())
    universalParking.park(Truck())
    universalParking.park(Motorcycle())
    println(universalParking.countVehicles()) // Output: 3
    println(universalParking.vehicles()) // Output: [Car, Truck, Motorcycle]*/
    /*//val db = DataBase.getInstance()
    val db = DataBase
    //val db = DataBase()
    db.insertData("1")
    db.insertData("2")
    for (str in db.data){
        println(str)
    }
    println()
    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")
    for (str in db.data){
        println(str)
    }*/

    /*val firstList = listOf(1, 4, 10)
    val mult2: (Int) -> Int = {it * 2}
    //val mult2: (Int) -> Int = {n: Int -> n * 2}
    val add2: (Int) -> Int = {it + 2}

    //val multList = mathWithList(firstList, mult2)
    //val addList = mathWithList(firstList, add2)
    //val multList = mathWithList(firstList, {it * 2})
    //val addList = mathWithList(firstList, {it + 2})

    //Если лямбда-параметр является последним в списке параметров функции, то при вызове функции его можно вынести за скобку:
    val multList = mathWithList(firstList) {it * 2}
    val addList = mathWithList(firstList) {it + 2}

    println(multList)  // [2, 8, 20]
    println(addList)   // [3, 6, 12]*/

    val data = mapOf<String, List<Int>>(
        "Январь" to listOf(67, 23, 56, 90),
        "Февраль" to listOf(67, 37, 56, 41),
        "Март" to listOf(70, 23, -14, 30),
        "Апрель" to listOf(67, 54, 56, 30),
        "Май" to listOf(67, 23, 43, 30),
        "Июнь" to listOf(60, 23, 56, 39),
        "Июль" to listOf(67, 23, 61, 30),
        "Август" to listOf(67, 23, 56, 42),
        "Сентябрь" to listOf(-35, 23, 56, 23),
        "Октябрь" to listOf(70, 23, 56, 30),
        "Ноябрь" to listOf(67, 32, 56, 45),
        "Декабрь" to listOf(67, 23, -45, 30)
    )
    printInfo(data)
}
fun printInfo(collection: Map<String, List<Int>>) {
    with(collection){
        val averageOfMonth = filterNot {
            it.value.any { it < 0 }
        }.flatMap { it.value }.average()
        println("Average revenue per month:$averageOfMonth")

        val averageOfWeek = filterNot {
            it.value.any { it < 0 }
        }.mapValues { it.value.average() }.entries
        println("Average revenue per week:$averageOfWeek")

        val maxRevenueOfMonth = filter {
            it.value.all { it > 0 }
        }.mapValues { it.value.sum() }.maxBy { it.value }
        println("Maximum monthly income: $maxRevenueOfMonth")

        val minRevenueOfMonth = filter {
            it.value.all { it > 0 }
        }.mapValues { it.value.sum() }.minBy { it.value }
        println("Minimum monthly income: $minRevenueOfMonth")

        val monthWithError = filterNot { it.value.all { it > 0 } }.keys
        println("Month with error: $monthWithError")
    }
}

fun mathWithList(yourList: List<Int>, math: (Int) -> Int): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in yourList) {
        newList.add(math(i))
    }
    return newList
}