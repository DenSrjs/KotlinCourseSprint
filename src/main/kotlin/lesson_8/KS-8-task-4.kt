package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "масло", "яйцо", "соль", "сахар")

    print("\nВведите название ингредиента для поиска: ")
    val searchIngredient = readln().lowercase()

    val index = ingredients.indexOfFirst { it.lowercase() == searchIngredient }

    if (index == -1){
        println("Такого ингредиента в рецепте нет")
        return
    }else{
        println("Ингредиент \"${ingredients[index]}\" в рецепте есть")
    }

    print("Введите название нового ингредиента: ")
    val newIngredient = readln().lowercase()
    ingredients[index] = newIngredient

    print("Состав рецепта: ")
    ingredients.forEach { ingridient -> print("$ingridient ") }
}