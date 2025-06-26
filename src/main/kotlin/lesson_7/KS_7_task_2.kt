package lesson_7

fun main(){

    do {
        val randomNumber = (1..4)
            .map { (1..9).random() }
            .joinToString ("")

        println("Ваш код авторизации: $randomNumber")

        print("Введите код авторизации: ")
        val userInput = readln()

        if (userInput.length != 4 || userInput.any{!it.isDigit()}){
            println("Ошибка: введите 4 цифры")
            continue
        }

        if (userInput == randomNumber)
            break
        else
            println("Неверный код, попробуйте снова")

    }while (true)

    println("\n\nДобро пожаловать!")
}