package lesson_9

fun main(){
    val listIngredients: MutableList<String> = readln().split(" ").toMutableList()
    println(listIngredients.joinToString())

    val sortIngredients = listIngredients.sorted()
    println(sortIngredients.joinToString())
}