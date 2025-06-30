package lesson_9

fun main(){
    println("Введите пять ингредиентов:")
    val ingredients = mutableListOf<String>()

    for (i in 0..4){
        val input = readln()
        ingredients.add(input)
    }

    ingredients.sort()
    ingredients[0] = ingredients[0].replaceFirstChar { it.uppercaseChar() }
    print(ingredients.toSet().joinToString(", "))
}