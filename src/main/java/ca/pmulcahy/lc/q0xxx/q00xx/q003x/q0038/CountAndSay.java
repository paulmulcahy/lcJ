package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0038;

/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

For example, the saying and conversion for digit string "3322251":
 */
public class CountAndSay {
  public static String countAndSay(int n) {
    String output = "1";
    for (int i = 1; i < n; i++) {
      output = iterate(output);
    }
    return output;
  }

  private static String iterate(String toIterate) {
    StringBuilder sb = new StringBuilder();
    char prev = toIterate.charAt(0);
    int count = 1;
    for (int i = 1; i < toIterate.length(); i++) {
      char character = toIterate.charAt(i);
      if (character == prev) {
        count++;
      } else {
        sb.append(count);
        sb.append(prev);
        prev = character;
        count = 1;
      }
    }
    sb.append(count);
    sb.append(prev);
    return sb.toString();
  }
}
