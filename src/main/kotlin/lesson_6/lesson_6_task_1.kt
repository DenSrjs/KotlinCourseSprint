package lesson_6

fun main() {
    println("Для входа в программу необходимо зарегистрироваться")

    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    var confirmed: Boolean

    println("Для входа в программу введите логин и пароль")
    var userInputLogin: String
    var userInputPassword: String

    do {
        print("Введите логин: ")
        userInputLogin = readln()

        print("Введите пароль: ")
        userInputPassword = readln()

        confirmed = (userLogin == userInputLogin) && (userPassword == userInputPassword)

        if (!confirmed)
            println("Логин и пароль неверны. Попробуйте еще раз")

    } while (!confirmed)

    println("Вы успешно зашли в систему")
}