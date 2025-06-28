package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "масло", "яйцо", "соль", "сахар")

    print("Введите название ингридиента в поиск: ")
    val searchIngrredient = readln().lowercase()

    if (ingredients.any { it.lowercase() == searchIngrredient }) {
        println("Игредиент \"$searchIngrredient\" в рецепте есть")
    } else {
        println("Такого ингридиента в рецепте нет")
    }
}
