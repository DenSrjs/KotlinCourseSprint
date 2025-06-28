package lesson_7

const val START_DELAY_TIME = 3

fun main(){
    println("Программа таймер")
    print("Введите время начала отсчета: ")
    val timer = readlnOrNull()?.toIntOrNull()

    if (timer == null || timer <=0){
        println("Ошибка: введено некорретное время")
        return
    }

    for (i in START_DELAY_TIME downTo 1){
        print("\rТаймер стартует через $i")
        try {
            Thread.sleep(1000)
        }catch (e: InterruptedException){
            println("\nТаймер завершен прерван")
            return
        }
    }

    for (i in timer downTo  1){
        print("\rОсталось: $i секунд")
        try {
            Thread.sleep(1000)
        }catch (e: InterruptedException){
            println("\nТаймер завершен прерван")
            return
        }
    }

    println("\n\nВремя вышло")
}