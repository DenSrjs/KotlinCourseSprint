package lesson_9

fun main() {
    val oneServing = mutableMapOf(
        "яиц" to 2,
        "молоко" to 50,
        "сливочное масло" to 15
    )

    println("Для приготовления одной порции омлета необходимо:")
    oneServing.forEach { (key, value) -> println("$key - $value") }

    print("\nВведите необходимое количество порций: ")
    val numberServing = readlnOrNull()?.toIntOrNull()

    if (numberServing == null || numberServing <= 0){
        println("Ошибка: не верный ввод")
        return
    }

    println("\nКоличество порций - $numberServing")
    println("Необходимо следующее количество ингредиентов: ")
    oneServing.forEach { (key, value) -> println("$key - ${value * numberServing}") }
}