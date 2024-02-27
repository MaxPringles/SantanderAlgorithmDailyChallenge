package com.alphanumericstringsort

class SortAlphanumericString {
    fun sortString(text: String): String {
        var evenNumbers = ""
        var oddNumbers = ""
        var upperCase = ""
        var lowerCase = ""
        var otherCharacter = ""

        for (char in text) {
            when (char) {
                '0','2','4','6','8' -> {
                    evenNumbers += char
                }
                '1','3','5','7','9' ->{
                    oddNumbers += char
                }
                in 'a'..'z' -> {
                    lowerCase += char
                }
                in 'A'..'Z' -> {
                    upperCase += char
                }
                else -> {
                    otherCharacter += char
                }
            }
        }

        return "$lowerCase$upperCase$oddNumbers$evenNumbers$otherCharacter"
    }
}
