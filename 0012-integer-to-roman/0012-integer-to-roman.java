class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        
        if (num / 1000 > 0) {
            int quotient = num / 1000;
            num -= 1000 * quotient;
            result.append("M".repeat(quotient));
        }
        
        if (num / 100 > 0) {
            result.append(cleanUp(num, 100, "CM", "D", "C"));
            int quotient = num / 100;
            num -= quotient * 100;
        }

        if (num / 10 > 0) {
            result.append(cleanUp(num, 10, "XC", "L", "X"));
            int quotient = num / 10;
            num -= quotient * 10;
        }

        if (num / 1 > 0) {
            result.append(cleanUp(num, 1, "IX", "V", "I"));
            int quotient = num / 1;
            num -= quotient * 1;
        }
        
        return result.toString();
    }

    public String cleanUp(int num, int divisor, String nine, String five, String one) {
        StringBuilder result = new StringBuilder();
        int quotient = num / divisor;
        num -= quotient;

        if (quotient == 9) {
            result.append(nine);
            quotient -= quotient;
        }

        if (quotient >= 5) {
            result.append(five);
            quotient -= 5;
        } 
        
        if (quotient == 4) {
            result.append(one + five);
            quotient -= quotient;
        }

        if (quotient < 4) {
            result.append(one.repeat(quotient));
            quotient -= quotient;
        }

        return result.toString();
    }
}