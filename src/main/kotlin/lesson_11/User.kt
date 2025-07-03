package lesson_11

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printInfoUser(){
        println("Идентификатор: $id" +
                "\nЛогин: $login" +
                "\nПароль: $password" +
                "\nПочта: $email" +
                "\nBio: $bio")
    }

    fun readConsoleText(){
        print("Введите ваше описани (bio): ")
        bio = readln()
    }

    fun changePassword(){
        print("Для изменения пароля введите текущий пароль: ")
        var currentPassword = readln()

        if (currentPassword == this.password){
            print("Введите новый пароль: ")
            this.password = readln()
            print("Пароль изменен")
        }else{
            println("Пароль не верный")
        }
    }
}