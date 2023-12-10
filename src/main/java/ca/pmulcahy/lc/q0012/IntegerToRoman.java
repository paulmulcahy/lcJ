package ca.pmulcahy.lc.q0012;

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
