package com.alphanumericstringsort

import org.junit.Assert.assertEquals
import org.junit.Test


class SortAlphanumericStringTest {
    private val sortAlphanumericString: SortAlphanumericString = SortAlphanumericString()

    @Test
    fun sortTests() {
        assertEquals("holaMUNDO5780®", sortAlphanumericString.sortString("M8hU5®oN7lDa0O"))
        assertEquals("abeCD4®", sortAlphanumericString.sortString("4a®CbDe"))
        assertEquals("bkpzALX37#", sortAlphanumericString.sortString("A3b#kL7pXz"))
        assertEquals("qsexgbkRYZPFH13862#*", sortAlphanumericString.sortString("R8q#Ys6Z*2ePx1Fg3bHk"))
        assertEquals("hptmqokDARLXZU59712#-", sortAlphanumericString.sortString("D5hA#pRt9mLq-X7o2ZkU1"))
    }
}
