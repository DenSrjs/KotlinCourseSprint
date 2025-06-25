package lesson_6

fun main() {
    println("Программа таймер")
    print("Введите время начала отсчета: ")
    var timer = readlnOrNull()?.toIntOrNull()

    if (timer == null || timer <=0){
        println("Ошибка: введено некорретное время")
        return
    }

    var currentTime = timer

    while (currentTime > 0) {
        print("\rОсталось: $currentTime секунд")
        Thread.sleep(1000)
        currentTime--
    }

    println("\n\nПрошло $timer секунд")
}