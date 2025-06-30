package lesson_9

fun main(){
    val listIngridients: List<String> = listOf("мука", "яйцо", "сахар", "соль", "вода")

    println("В рецепте есть следующие ингридиенты: ")
    listIngridients.forEach { println(it) }
}