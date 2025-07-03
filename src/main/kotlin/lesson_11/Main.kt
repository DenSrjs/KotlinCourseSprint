package lesson_11

fun main(){
    val user1 = User(
        2,
        "alex",
        "123345",
        "qweer@sdsdf.com",
        )

    user1.printInfoUser()
    user1.readConsoleText()
    user1.changePassword()
    user1.printInfoUser()
}