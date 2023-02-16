// Link problem : https://leetcode.com/problems/convert-the-temperature/

fun main() {
    ConvertTheTemperature().convertTemperature(36.50).forEach { print("$it ") }
}


class ConvertTheTemperature {
    fun convertTemperature(celsius: Double) = mutableListOf<Double>().apply {
        add(0, celsius + 273.15)
        add(1, celsius * 1.80 + 32.00)
    }
}