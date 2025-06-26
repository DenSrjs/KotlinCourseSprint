package lesson_6

fun main() {
    println("Игра угадай число от 1 до 9 с 5 попыток")

    val randomInt = kotlin.random.Random.nextInt(1, 10)
    var numberOfAttempts = 5

    while (numberOfAttempts > 0) {
        var number: Int? = null

        do {
            print("Введите целое положительное число от 1 до 9: ")

            val input = readln()
            number = input.toIntOrNull()

            if (number == null || number <= 0 || number > 9) {
                println("Вы ввели некорректное число")
                number = null
            }

        } while (number == null)

        if (number == randomInt) {
            println("Вы выиграли было загадано число $randomInt")
            return
        } else {
            println("Количество попыток ${--numberOfAttempts}")
        }
    }

    println("Вы проиграли у вас осталось 0 попыток")
}