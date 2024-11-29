class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        
        if (num / 1000 > 0) {
            int quotient = num / 1000;
            num -= 1000 * quotient;
            result.append("M".repeat(quotient));
        }
        
        if (num / 100 > 0) {
            int quotient = num / 100;
            num -= 100 * quotient;
            
            if (quotient == 9) {
                result.append("CM");
                quotient -= quotient;
            }

            if (quotient >= 5) {
                result.append("D");
                quotient -= 5;
            } 
            
            if (quotient == 4) {
                result.append("CD");
                quotient -= quotient;
            }

            if (quotient < 4) {
                result.append("C".repeat(quotient));
                quotient -= quotient;
            }
        }

        if (num / 10 > 0) {
            int quotient = num / 10;
            num -= 10 * quotient;

            if (quotient == 9) {
                result.append("XC");
                quotient -= quotient;
            }

            if (quotient >= 5) {
                result.append("L");
                quotient -= 5;
            }

            if (quotient == 4) {
                result.append("XL");
                quotient -= quotient;
            }

            if (quotient < 4) {
                result.append("X".repeat(quotient));
                quotient -= quotient;
            }
        }

        if (num / 1 > 0) {
            int quotient = num;
            num -= quotient;

            if (quotient == 9) {
                result.append("IX");
                quotient -= quotient;
            }

            if (quotient >= 5) {
                result.append("V");
                quotient -= 5;
            } 
            
            if (quotient == 4) {
                result.append("IV");
                quotient -= quotient;
            }

            if (quotient < 4) {
                result.append("I".repeat(quotient));
                quotient -= quotient;
            }

            
        }
        
        return result.toString();
    }
}