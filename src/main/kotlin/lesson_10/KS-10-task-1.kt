package lesson_10

const val ZERO = 0

fun main() {
    var humanScore = 0
    var computerScore = 0
    var count = 6
    var isHuman = true
    var player = "Человек"

    while (count > ZERO) {
        println("\nОсталось бросков: $count")

        val number = if (isHuman) {
            val roll = makeRoll(player)
            humanScore += roll
            isHuman = false
            player = "Компьютер"
            roll
        } else {
            val roll = makeRoll(player)
            computerScore += roll
            isHuman = true
            player = "Человек"
            roll
        }

        println("Счет: Человек $humanScore : Компьютер $computerScore")

        count--
    }

    when {
        humanScore > computerScore -> println("\n\nПобедил человек со счетом $humanScore : $computerScore")
        humanScore < computerScore -> println("\n\nПобедил компьютер со счетом $computerScore : $humanScore")
        else -> println("\n\nПобедила дружба $humanScore : $computerScore")
    }
}

fun rollOfDice(): Int = kotlin.random.Random.nextInt(1, 7)

fun makeRoll(playerName: String): Int {
    val roll = rollOfDice()
    println("\n$playerName бросает кубик...")
    Thread.sleep(2000)
    println("Выпадает $roll")
    Thread.sleep(2000)
    return roll
}