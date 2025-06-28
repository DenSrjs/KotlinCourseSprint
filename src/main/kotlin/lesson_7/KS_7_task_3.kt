package lesson_7

fun main(){
    print("Введите максимальное число диапазона: ")
    val inputNumber = readlnOrNull()?.toIntOrNull()

    if (inputNumber == null || inputNumber < 0){
        println("Введите положительное число")
        return
    }

    for (i in 0..inputNumber step 2) println(i)
}