package lesson_10

fun main() {
    println("Генерация случайного пароля")

    var lengthPassword: Int = 0

    do {
        print("Длина пароля должна быть больше 1 символа: ")
        val length = readlnOrNull()?.toIntOrNull()

        if (length == null || length <= 1)
            println("Неверно")
        else {
            lengthPassword = length

            break
        }

    } while (true)

    val randomPassword = generationPassword(lengthPassword)

    println(randomPassword)
}

fun generationPassword(length: Int): String {
    val chars = "!@#/$%^&*+-, "
    val number = (0..9)
    var count = 0
    var password = StringBuilder()

    while (count < length){
        password.append(number.random())
        count++

        if (count < length){
            password.append(chars.random())
            count++
        }
    }

    return password.toString()
}