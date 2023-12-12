package ca.pmulcahy.lc.q0013;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {
  public static int romanToInt(String s) {
    int output = 0;
    int counter = 0;

    while (counter < s.length() && s.charAt(counter) == 'M') {
      output += 1000;
      counter++;
    }

    if (counter < s.length() - 1 && s.charAt(counter) == 'C' && s.charAt(counter + 1) == 'M') {
      output += 900;
      counter += 2;
    }

    while (counter < s.length() && s.charAt(counter) == 'D') {
      output += 500;
      counter++;
    }

    if (counter < s.length() - 1 && s.charAt(counter) == 'C' && s.charAt(counter + 1) == 'D') {
      output += 400;
      counter += 2;
    }

    while (counter < s.length() && s.charAt(counter) == 'C') {
      output += 100;
      counter++;
    }

    if (counter < s.length() - 1 && s.charAt(counter) == 'X' && s.charAt(counter + 1) == 'C') {
      output += 90;
      counter += 2;
    }

    while (counter < s.length() && s.charAt(counter) == 'L') {
      output += 50;
      counter++;
    }

    if (counter < s.length() - 1 && s.charAt(counter) == 'X' && s.charAt(counter + 1) == 'L') {
      output += 40;
      counter += 2;
    }

    while (counter < s.length() && s.charAt(counter) == 'X') {
      output += 10;
      counter++;
    }

    if (counter < s.length() - 1 && s.charAt(counter) == 'I' && s.charAt(counter + 1) == 'X') {
      output += 9;
      counter += 2;
    }

    while (counter < s.length() && s.charAt(counter) == 'V') {
      output += 5;
      counter++;
    }

    if (counter < s.length() - 1 && s.charAt(counter) == 'I' && s.charAt(counter + 1) == 'V') {
      output += 4;
      counter += 2;
    }

    while (counter < s.length() && s.charAt(counter) == 'I') {
      output++;
      counter++;
    }

    return output;
  }
}
