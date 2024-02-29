package com.alphanumericstringsort.challengethree

class TicTacToe {
    private var moves = mutableListOf<String>()
    private var arrayA = mutableListOf<String>()
    private var arrayB = mutableListOf<String>()
    private var movesA = Array(3) { Array(3) { "" } }
    private var movesB = Array(3) { Array(3) { "" } }

    fun startGame(input: String): String {
        moves = input.replace("],[", " ").replace("[[", "").replace("]]", "").split(" ").toMutableList()

        setMoves()

        return whoIsTheWinner()
    }

    private fun setMoves() {
        for (moveA in moves) {
            if (moves.indexOf(moveA) % 2 == 0) {
                arrayA.add(moveA)
            }
        }
        for (moveB in moves) {
            if (moves.indexOf(moveB) % 2 != 0) {
                arrayB.add(moveB)
            }
        }
        for (moveA in arrayA) {
            val x = moveA.split(",")[0].toInt()
            val y = moveA.split(",")[1].toInt()
            movesA[x][y] = "A"
        }
        for (moveB in arrayB) {
            val x = moveB.split(",")[0].toInt()
            val y = moveB.split(",")[1].toInt()
            movesB[x][y] = "B"
        }
    }

    private fun whoIsTheWinner(): String {
        return if (isThisAWinner(movesA)) {
            "Output: A\nExplanation: A wins, they always play first."
        } else if (isThisAWinner(movesB)) {
            "Output: B\nExplanation: B wins."
        } else {
            if (moves.size == 9) {
                "Output: Draw\nExplanation: The game ends in a draw since there are no moves to make."
            } else {
                "Output: Pending..."
            }
        }
    }

    fun isThisAWinner(moves: Array<Array<String>>): Boolean {
        return if (horizontalWin(moves)) {
            true
        } else if (verticalWin(moves)) {
            true
        } else if (leftDiagonalWin(moves)) {
            true
        } else rightDiagonalWin(moves)
    }

    fun horizontalWin(moves: Array<Array<String>>): Boolean {
        var counter = 0
        var isWinner = false
        for(i in 0..2) {
            for (j in 0..2) {
                if (moves[i][j] != "") {
                    counter++
                }
            }
            if (counter == 3) {
                isWinner = true
            }
            counter = 0
        }
        return isWinner
    }

    fun verticalWin(moves: Array<Array<String>>): Boolean {
        var counter = 0
        var isWinner = false
        for(i in 0..2) {
            for (j in 0..2) {
                if (moves[j][i] != "") {
                    counter++
                }
            }
            if (counter == 3) {
                isWinner = true
            }
            counter = 0
        }
        return isWinner
    }

    fun rightDiagonalWin(moves: Array<Array<String>>): Boolean {
        var counter = 0
        var isWinner = false
        for(i in 0..2) {
            if (moves[i][i] != "") {
                counter++
            }
        }
        if (counter == 3) {
            isWinner = true
        }
        return isWinner
    }

    fun leftDiagonalWin(moves: Array<Array<String>>): Boolean {
        var counter = 0
        var isWinner = false
        for(i in 0..2) {
            if (moves[i][2-i] != "") {
                counter++
            }
        }
        if (counter == 3) {
            isWinner = true
        }
        return isWinner
    }
}