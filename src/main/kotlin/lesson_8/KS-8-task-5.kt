package lesson_8

fun main(){
    print("Введите количество ингридиентов: ")
    val size= readlnOrNull()?.toIntOrNull()

    if (size == null || size <= 0){
        println("Ошибка: введите число больше ноля")
        return
    }

    val ingredients = Array(size){""}

    for (i in ingredients.indices){
        print("Введите название ингридиента ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Рецепт заполнен: ${ingredients.joinToString()}")
}