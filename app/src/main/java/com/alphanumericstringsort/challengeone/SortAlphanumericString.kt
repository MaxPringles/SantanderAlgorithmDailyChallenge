package com.alphanumericstringsort.challengeone

class SortAlphanumericString {
    fun sortString(text: String): String {
        val evenNumbers = arrayListOf<String>()
        val oddNumbers = arrayListOf<String>()
        val upperCase = arrayListOf<String>()
        val lowerCase = arrayListOf<String>()
        val otherCharacter = arrayListOf<String>()

        for (char in text) {
            when (char) {
                '0', '2', '4', '6', '8' -> {
                    evenNumbers.add(char.toString())
                }

                '1', '3', '5', '7', '9' -> {
                    oddNumbers.add(char.toString())
                }

                in 'a'..'z' -> {
                    lowerCase.add(char.toString())
                }

                in 'A'..'Z' -> {
                    upperCase.add(char.toString())
                }

                else -> {
                    otherCharacter.add(char.toString())
                }
            }
        }
        lowerCase.sort()
        upperCase.sort()
        oddNumbers.sort()
        evenNumbers.sort()

        return lowerCase.joinToString(separator = "") +
                upperCase.joinToString(separator = "") +
                oddNumbers.joinToString(separator = "") +
                evenNumbers.joinToString(separator = "") +
                otherCharacter.joinToString(separator = "")
    }
}
