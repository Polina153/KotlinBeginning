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

// Базовый класс транспортного средства
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
}

// Пример использования:
fun main() {
    // Создаем парковку для легковых автомобилей
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
    println(universalParking.vehicles()) // Output: [Car, Truck, Motorcycle]
}