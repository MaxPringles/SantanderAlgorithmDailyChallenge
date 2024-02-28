package com.alphanumericstringsort.challengetwo

class BalancedParenthesis {
    fun isBalancedParenthesis(text: String): Boolean {
        var counter = 0
        for (char in text) {
            if (counter >= 0) {
                if (char == '(') {
                    counter++
                } else if (char == ')') {
                    counter--
                }
            } else {
                break
            }
        }
        return counter == 0
    }
}