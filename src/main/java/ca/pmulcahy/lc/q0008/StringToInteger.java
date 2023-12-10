package ca.pmulcahy.lc.q0008;
/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */
public class StringToInteger {

	public static String MAX_INT_STRING = Integer.toString(Integer.MAX_VALUE);
	public static String MIN_INT_STRING_WITHOUT_NEG = Integer.toString(Integer.MIN_VALUE).substring(1);
	
	public static int myAtoi(String s) {
        boolean neg = false;
        boolean endWhitespace = false;
        boolean endNegPos = false;
        boolean beginDigits = false;
        boolean endDigits = false;
        
        var digitsStringBuilder = new StringBuilder();
        
        for(int i = 0; i < s.length() && !endDigits; i++) {
        	char c = s.charAt(i);
        	switch(c) {
        	case ' ':
        		if(endWhitespace) {
        			endNegPos = true;
        			endDigits = true;
        		}
        		break;
        	case '-':
        		if(!endNegPos) {
        			endWhitespace = true;
        			endNegPos = true;
        			neg = true;
        		} else if(!endDigits) {
        			endDigits = true;
        		}
        		break;
        	case '+':
        		if(!endNegPos) {
        			endWhitespace = true;
        			endNegPos = true;
        		} else {
        			endDigits = true;
        		}
        		break;
        	case '1':
        	case '2':
        	case '3':
        	case '4':
        	case '5':
        	case '6':
        	case '7':
        	case '8':
        	case '9':
        		beginDigits = true;
        	case '0':
        		endWhitespace = true;
        		endNegPos = true;
        		if(beginDigits && !endDigits) {
        			digitsStringBuilder.append(c);
        		}
        		break;
        	default:
        		endWhitespace = true;
        		endNegPos = true;
        		endDigits = true;
        		break;
        	}
        }
        
        String digits = digitsStringBuilder.toString();
        
        if(digits.isEmpty()){
        	return 0;
        }
        if(neg) {
        	if(digits.length() > MIN_INT_STRING_WITHOUT_NEG.length()) {
        		return Integer.MIN_VALUE;
        	}
        	if(digits.length() < MIN_INT_STRING_WITHOUT_NEG.length()) {
        		return Integer.valueOf("-" + digits);
        	}
        	if(digits.compareTo(MIN_INT_STRING_WITHOUT_NEG) > 0) {
        		return Integer.MIN_VALUE;
        	}
        	return Integer.valueOf("-" + digits);
        }
    	if(digits.length() > MAX_INT_STRING.length()) {
    		return Integer.MAX_VALUE;
    	}
    	if(digits.length() < MAX_INT_STRING.length()) {
    		return Integer.valueOf(digits);
    	}
    	if(digits.compareTo(MAX_INT_STRING) > 0) {
    		return Integer.MAX_VALUE;
    	}
    	return Integer.valueOf(digits);
    }
}
