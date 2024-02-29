package com.alphanumericstringsort.challengethree

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
class TicTacToeTest {
    private val ticTacToe: TicTacToe = TicTacToe()

    @Test
    fun validateWinnerA() {
        assertEquals("Output: A\nExplanation: A wins, they always play first.", ticTacToe.startGame("[[0,0],[2,0],[1,1],[2,1],[2,2]]"))
    }

    @Test
    fun validateWinnerB() {
        assertEquals("Output: B\nExplanation: B wins.", ticTacToe.startGame("[[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]"))
    }

    @Test
    fun validateDraw() {
        assertEquals("Output: Draw\nExplanation: The game ends in a draw since there are no moves to make.", ticTacToe.startGame("[[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]"))
    }

    @Test
    fun validatePendingGame() {
        assertEquals("Output: Pending...", ticTacToe.startGame("[[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2]]"))
    }

    @Test
    fun horizontalWin() {
        assertTrue(ticTacToe.verticalOrHorizontalWin(arrayOf(arrayOf("","",""),arrayOf("A","A","A"),arrayOf("","",""))))
    }

    @Test
    fun verticalWin() {
        assertTrue(ticTacToe.verticalOrHorizontalWin(arrayOf(arrayOf("","A",""),arrayOf("","A",""),arrayOf("","A",""))))
    }

    @Test
    fun verticalorHorizontalWin() {
        assertTrue(ticTacToe.verticalOrHorizontalWin(arrayOf(arrayOf("","A","A"),arrayOf("A","A",""),arrayOf("","A",""))))
    }

    @Test
    fun rightDiagonalWin() {
        assertTrue(ticTacToe.diagonalWin(arrayOf(arrayOf("A","",""),arrayOf("","A",""),arrayOf("","","A"))))
    }

    @Test
    fun leftDiagonalWin() {
        assertTrue(ticTacToe.diagonalWin(arrayOf(arrayOf("","","A"),arrayOf("","A",""),arrayOf("A","",""))))
    }

    @Test
    fun diagonalWin() {
        assertTrue(ticTacToe.diagonalWin(arrayOf(arrayOf("A","","A"),arrayOf("","A",""),arrayOf("A","",""))))
    }

    @Test
    fun isThisAWinner() {
        assertTrue(ticTacToe.isThisAWinner(arrayOf(arrayOf("","","A"),arrayOf("","A",""),arrayOf("A","",""))))
    }

    @Test
    fun thisIsALoser() {
        assertFalse(ticTacToe.isThisAWinner(arrayOf(arrayOf("","","A"),arrayOf("","A",""),arrayOf("","A",""))))
    }

}