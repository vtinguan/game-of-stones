package br.com.game

import java.util.*

class Game {

    companion object {
        fun checkWinner(iterationList: Collection<Int>): MutableList<GamePlayers> {
            val response: MutableList<GamePlayers> = arrayListOf()
            iterationList.map {
                if(it % 7 > 1) {
                    System.out.println(GamePlayers.FIRST.friendlyName)
                    response.add(GamePlayers.FIRST)
                } else {
                    System.out.println(GamePlayers.SECOND.friendlyName)
                    response.add(GamePlayers.SECOND)
                }
            }
            return response
        }

        fun checkInputValue(inputValue: Int) {
            if(inputValue <= 0) {
                throw IllegalStateException("Value can't be less than 1")
            }
        }
    }

}

enum class GamePlayers(val friendlyName: String){
    FIRST("First"), SECOND("Second")
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val testNum = input.nextInt()
    Game.checkInputValue(testNum)

    val inputedValues :MutableList<Int> = arrayListOf()

    for(i in 1..testNum) {
        val inputedValue = input.nextInt()
        Game.checkInputValue(inputedValue)
        inputedValues.add(inputedValue)
    }
    Game.checkWinner(inputedValues)
}