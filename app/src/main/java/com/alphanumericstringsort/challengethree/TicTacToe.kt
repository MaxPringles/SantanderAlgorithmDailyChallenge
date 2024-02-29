package com.alphanumericstringsort.challengethree

class TicTacToe {
    private var moves = mutableListOf<String>()
    private var arrayA = mutableListOf<String>()
    private var arrayB = mutableListOf<String>()
    private var movesA = Array(3) { Array(3) { "" } }
    private var movesB = Array(3) { Array(3) { "" } }

    fun startGame(input: String): String {
        moves = input
            .replace("[[", "")
            .replace("]]", "")
            .split("],[").toMutableList()

        setMoves()

        return whoIsTheWinner()
    }

    private fun setMoves() {
        for (move in moves) {
            if (moves.indexOf(move) % 2 == 0) {
                arrayA.add(move)
            } else {
                arrayB.add(move)
            }
        }

        for (moveA in arrayA) {
            movesA[moveA.split(",")[0].toInt()][moveA.split(",")[1].toInt()] = "A"
        }

        for (moveB in arrayB) {
            movesB[moveB.split(",")[0].toInt()][moveB.split(",")[1].toInt()] = "B"
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
        return if (verticalOrHorizontalWin(moves)) {
            true
        } else diagonalWin(moves)
    }

    fun verticalOrHorizontalWin(moves: Array<Array<String>>): Boolean {
        var counterHorizontal = 0
        var counterVertical = 0
        var isWinner = false
        for(i in 0..2) {
            for (j in 0..2) {
                if (moves[i][j] != "") {
                    counterHorizontal++
                }
                if (moves[j][i] != "") {
                    counterVertical++
                }
            }
            if (counterHorizontal == 3 || counterVertical == 3) {
                isWinner = true
            }
            counterHorizontal = 0
            counterVertical = 0
        }
        return isWinner
    }

    fun diagonalWin(moves: Array<Array<String>>): Boolean {
        var counterRight = 0
        var counterLeft = 0
        var isWinner = false
        for(i in 0..2) {
            if (moves[i][i] != "") {
                counterRight++
            }
            if (moves[i][2-i] != "") {
                counterLeft++
            }
        }
        if (counterRight == 3 || counterLeft == 3) {
            isWinner = true
        }
        return isWinner
    }
}