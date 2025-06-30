package lesson_9

fun main() {
    val listIngridients: MutableList<String> = mutableListOf("мука", "сахар", "вода")

    print("В рецепте есть базовые ингредиенты: ${listIngridients.joinToString(", ")}")

    val addIngridients: MutableList<String> = mutableListOf()

    while (true) {
        print("\nЖелаете добавить еще Да/Нет: ")
        val inputUser = readln().lowercase()

        when (inputUser) {
            "да" -> {
                print("Введите название игридиента: ")
                val text = readln().lowercase()

                if (text.any { it.isLetter() }) {
                    addIngridients.add(text)
                } else {
                    println("Введите слово")
                }
            }

            "нет" -> {
                if (addIngridients.isNotEmpty()) {
                    for (i in addIngridients) {
                        if (i !in listIngridients) {
                            listIngridients.add(i)
                        }
                    }
                    print("Новые добавленные ингредиенты ${addIngridients.joinToString(", ")}")
                } else {
                    println("Новые ингридиенты отсутствуют")
                }
                print("\nСписок ингредиентов: ${listIngridients.joinToString(", ")}")
                return
            }

            else -> println("Необходимо ответить Да или Нет")
        }
    }
}