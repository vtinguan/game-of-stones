package br.com.game

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    fun testWhenIts8TestCasesValues1To8() {
        val inputedValues = listOf(1,2,3,4,5,6,7,8)
        val responseValues = listOf(GamePlayers.SECOND, GamePlayers.FIRST,
                GamePlayers.FIRST, GamePlayers.FIRST, GamePlayers.FIRST, GamePlayers.FIRST,
                GamePlayers.SECOND, GamePlayers.SECOND)
        val result = Game.checkWinner(inputedValues)
        Assert.assertEquals(responseValues, result)
    }
}