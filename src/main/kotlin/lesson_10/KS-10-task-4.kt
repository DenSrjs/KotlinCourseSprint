package lesson_10

const val VALUE_0 = 0
const val VALUE_1 = 1
const val VALUE_4 = 4
const val VALUE_7 = 7
const val TIME = 2000L

fun main() {

    var roundHumanScore = VALUE_0
    var roundComputerScore = VALUE_0

    var round = VALUE_1
    var isActive = true

    while (isActive) {
        println("Раунд: $round")

        val (humanScore, computerScore) = playerRound()

        if (humanScore > computerScore) {
            roundHumanScore++
            println("\nПобедил человек со счетом $humanScore : $computerScore")
        } else if (humanScore < computerScore) {
            roundComputerScore++
            println("\nПобедил компьютер со счетом $humanScore : $computerScore")
        } else {
            println("\n\nПобедила дружба $humanScore : $computerScore")
        }

        if (!askToContinue()) {
            isActive = false
            println("\nИтог по раундам:")

            when {
                roundHumanScore > roundComputerScore -> {
                    println("\nПобедил человек со счетом $roundHumanScore : $roundComputerScore")
                }

                roundHumanScore < roundComputerScore -> {
                    println("\nПобедил компьютер со счетом $roundHumanScore : $roundComputerScore")
                }

                else -> println("\nПобедила дружба $roundHumanScore : $roundComputerScore")
            }
        } else {
            round++
        }
    }
}

fun playerRound(): Pair<Int, Int> {
    var humanScore = VALUE_0
    var computerScore = VALUE_0
    var count = VALUE_4
    var isHuman = true
    var player = "Человек"

    while (count > VALUE_0) {
        println("\nОсталось бросков: $count")

        val roll = makeRoll(player)

        if (isHuman) {
            humanScore += roll
            isHuman = false
            player = "Компьютер"
        } else {
            computerScore += roll
            isHuman = true
            player = "Человек"
        }

        println("Счет: Человек $humanScore : Компьютер $computerScore")

        count--
    }
    return Pair(humanScore, computerScore)
}

fun askToContinue(): Boolean {
    while (true) {
        print("Желаете сыграть еще раунд Да/Нет: ")

        when (readln().lowercase()) {
            "да" -> return true
            "нет" -> return false
            else -> println("Ошибка: введите да или нет")
        }
    }
}

fun rollOfDice(): Int = kotlin.random.Random.nextInt(VALUE_1, VALUE_7)

fun makeRoll(playerName: String): Int {
    val roll = rollOfDice()
    println("\n$playerName бросает кубик...")
    Thread.sleep(TIME)
    println("Выпадает $roll")
    Thread.sleep(TIME)
    return roll
}