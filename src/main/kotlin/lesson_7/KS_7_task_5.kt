package lesson_7

fun main() {
    println("Генерация случайного пароля")
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*"
    var end: Int = 0

    do {
        print("Длина пароля должна быть не меньше 6 символов: ")
        val lengthPassword = readlnOrNull()?.toIntOrNull()
        if (lengthPassword == null || lengthPassword < 6)
            println("Неверно")
        else {
            end = lengthPassword
            break
        }

    } while (true)

    val randomString = (1..end)
        .map { chars.random() }
        .joinToString("")

    println(randomString)
}