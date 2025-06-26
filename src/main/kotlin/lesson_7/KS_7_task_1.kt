package lesson_7
fun main(){
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*"
    val randomString = (1..8)
        .map { chars.random() }
        .joinToString("")

    println(randomString)
}