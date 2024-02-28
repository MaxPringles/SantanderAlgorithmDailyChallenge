package com.alphanumericstringsort.challengetwo

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BalancedParenthesisTest {
    private val balancedParenthesis: BalancedParenthesis = BalancedParenthesis()
    @Test
    fun isBalancedParenthesis() {
        assertTrue(balancedParenthesis.isBalancedParenthesis("(hola)"))
        assertFalse(balancedParenthesis.isBalancedParenthesis(")hola("))
        assertTrue(balancedParenthesis.isBalancedParenthesis("Random text (as this) is ok()."))
        assertFalse(balancedParenthesis.isBalancedParenthesis("())(()"))
        assertTrue(balancedParenthesis.isBalancedParenthesis("(Hello (,) world (!))"))
    }
}