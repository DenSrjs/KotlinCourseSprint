package lesson_10

import kotlin.random.Random

// Константы с правильными данными
const val CORRECT_LOGIN = "user123"
const val CORRECT_PASSWORD = "pass123"

// Переменная для хранения сгенерированного токена
var currentToken: String? = null

// Пример корзины
val shoppingCart = listOf("Молоко", "Хлеб", "Яйца", "Сыр")

fun main() {
    // Предопределённые логин и пароль (можно заменить на ввод)
    val login = "user123"
    val password = "pass123"

    val token = authorize(login, password)
    if (token != null) {
        println("Авторизация успешна. Токен: $token")
        val cart = getCart(token)
        if (cart != null) {
            println("Содержимое корзины:")
            cart.forEach { println("- $it") }
        } else {
            println("Не удалось получить корзину: неверный токен")
        }
    } else {
        println("Ошибка авторизации: неправильный логин или пароль")
    }
}

// Авторизация: проверка и генерация токена
fun authorize(login: String, password: String): String? {
    return if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) {
        currentToken = generateToken(32)
        currentToken
    } else {
        null
    }
}

// Генерация токена: 32 символа из цифр и букв
fun generateToken(length: Int): String {
    val chars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    return (1..length)
        .map { chars.random() }
        .joinToString("")
}

// Получение корзины по токену
fun getCart(token: String): List<String>? {
    return if (token == currentToken) {
        shoppingCart
    } else {
        null
    }
}
