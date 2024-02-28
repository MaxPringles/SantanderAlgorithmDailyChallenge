package com.alphanumericstringsort

import com.alphanumericstringsort.challengeone.SortAlphanumericString
import org.junit.Assert.assertEquals
import org.junit.Test


class SortAlphanumericStringTest {
    private val sortAlphanumericString: SortAlphanumericString = SortAlphanumericString()

    @Test
    fun sortTests() {
        assertEquals("ahloDMNOU5708®", sortAlphanumericString.sortString("M8hU5®oN7lDa0O"))
        assertEquals("beCD4á®", sortAlphanumericString.sortString("4á®CbDe"))
        assertEquals("bkpzALX37#", sortAlphanumericString.sortString("A3b#kL7pXz"))
        assertEquals("begkqsxFHPRYZ13268#*", sortAlphanumericString.sortString("R8q#Ys6Z*2ePx1Fg3bHk"))
        assertEquals("hkmopqtADLRUXZ15792#-", sortAlphanumericString.sortString("D5hA#pRt9mLq-X7o2ZkU1"))
    }
}
