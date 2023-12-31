package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0006;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

 */
public class ZigzagConversion {

  public static String convert(String s, int numRows) {
    var stringBuilder = new StringBuilder();

    int numCharsToZigZag;
    if (numRows == 1) {
      numCharsToZigZag = 1;
    } else {
      int numMiddleRows = numRows - 2 > 0 ? numRows - 2 : 0;
      numCharsToZigZag = (numMiddleRows * 2) + 2;
    }

    for (int i = 0; i < numRows; i++) {
      boolean zag = !(i == 0 || i == numRows - 1);
      int zagNum = (numRows - i - 1) * 2;

      for (int j = i; j < s.length(); j += numCharsToZigZag) {
        stringBuilder.append(s.charAt(j));
        if (zag && j + zagNum < s.length()) {
          stringBuilder.append(s.charAt(j + zagNum));
        }
      }
    }
    return stringBuilder.toString();
  }
}
