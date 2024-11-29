class Solution {
    fun intToRoman(num: Int): String {
        var n = num
        var result = ""
        if (n / 1000 > 0) {
            val quotient = n / 1000
            result += "M".repeat(quotient)
            n -= 1000 * quotient
        }

        if (n / 100 > 0) {
            var quotient = n / 100
            n -= quotient * 100

            if (quotient == 9) {
                result += "CM"
                quotient -= quotient
            }

            if (quotient >= 5) {
                result += "D"
                quotient -= 5
            }

            if (quotient == 4) {
                result += "CD"
                quotient -= quotient
            }

            if (quotient < 4) {
                result += "C".repeat(quotient)
                quotient -= quotient
            }
        }

        if (n / 10 > 0) {
            var quotient = n / 10
            n -= quotient * 10
            if (quotient == 9) {
                result += "XC"
                quotient -= quotient
            }

            if (quotient >= 5) {
                result += "L"
                quotient -= 5
            }

            if (quotient == 4) {
                result += "XL"
                quotient -= quotient
            }

            if (quotient < 4) {
                result += "X".repeat(quotient)
                quotient -= quotient
            }
        }

        if (n / 1 > 0) {
            var quotient = n / 1
            n -= quotient * 1

            if (quotient == 9) {
                result += "IX"
                quotient -= quotient
            }

            if (quotient >= 5) {
                result += "V"
                quotient -= 5
            }

            if (quotient == 4) {
                result += "IV"
                quotient -= quotient
            }

            if (quotient < 4) {
                result += "I".repeat(quotient)
                quotient -= quotient
            }
        }

        return result;
    }
}