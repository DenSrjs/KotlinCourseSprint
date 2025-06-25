package lesson_6

fun main() {
    println("Для входа в программу необходимо зарегистрироваться")

    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    var count = 3

    println("Для продолжения регистрации докажите что вы не бот")
    println("У вас 3 попытки")

    do {
        val randomNumber1 = kotlin.random.Random.nextInt(1, 10)
        val randomNumber2 = kotlin.random.Random.nextInt(1, 10)

        print("Чему равна сумма чисел $randomNumber1 + $randomNumber2 = ")
        val userNumber = readln().toInt()

        if (userNumber == (randomNumber1 + randomNumber2)) {
            println("Вы успешно зарегистрировались")
            break
        } else {
            --count

            if (count == 0) {
                println("Вы бот")
                return
            }
        }

        println("Неверно. Количество попыток $count")

    } while (true)

    println("Для входа в программу введите логин и пароль")

    while (true) {
        print("Введите логин: ")
        val userInputLogin = readln()

        print("Введите пароль: ")
        val userInputPassword = readln()

        val logPassword = (userLogin == userInputLogin) && (userPassword == userInputPassword)

        if (logPassword) {
            println("Вы успешно зашли в систему")
            break
        } else
            println("Логин и пароль неверны. Попробуйте еще раз")
    }
}