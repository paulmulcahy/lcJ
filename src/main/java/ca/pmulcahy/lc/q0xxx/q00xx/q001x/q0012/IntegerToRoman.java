package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0012;

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
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
 */
public class IntegerToRoman {
  public static String intToRoman(int num) {
    var stringBuilder = new StringBuilder();

    int m = num / 1000;
    for (int i = 0; i < m; i++) {
      stringBuilder.append("M");
    }
    num %= 1000;

    if (num >= 900) {
      stringBuilder.append("CM");
      num -= 900;
    }

    int d = num / 500;
    for (int i = 0; i < d; i++) {
      stringBuilder.append("D");
    }
    num %= 500;

    if (num >= 400) {
      stringBuilder.append("CD");
      num -= 400;
    }

    int c = num / 100;
    for (int i = 0; i < c; i++) {
      stringBuilder.append("C");
    }
    num %= 100;

    if (num >= 90) {
      stringBuilder.append("XC");
      num -= 90;
    }

    int l = num / 50;
    for (int i = 0; i < l; i++) {
      stringBuilder.append("L");
    }
    num %= 50;

    if (num >= 40) {
      stringBuilder.append("XL");
      num -= 40;
    }

    int x = num / 10;
    for (int i = 0; i < x; i++) {
      stringBuilder.append("X");
    }
    num %= 10;

    if (num >= 9) {
      stringBuilder.append("IX");
      num -= 9;
    }

    int v = num / 5;
    for (int i = 0; i < v; i++) {
      stringBuilder.append("V");
    }
    num %= 5;

    if (num >= 4) {
      stringBuilder.append("IV");
      num -= 4;
    }

    for (int i = 0; i < num; i++) {
      stringBuilder.append("I");
    }

    return stringBuilder.toString();
  }
}
