package lesson_10

fun main(){
    println("Для входа в программу необходимо зарегистрироваться")

    print("Введите логин: ")
    val userLogin = readln()
    val isLogin = checkingLengthData(userLogin)

    print("Введите пароль: ")
    val userPassword = readln()
    val isPassword = checkingLengthData(userPassword)

    showMessage(isLogin, isPassword)
}

fun checkingLengthData(data: String): Boolean = data.length >= 4

fun showMessage(isLogin: Boolean, isPassword:Boolean){

        if(isLogin && isPassword) {
            println("Вы успешно зарегистрировались")
        }
        else {
            println("Логин или пароль недостаточно длинные")
        }
}