package ca.pmulcahy.lc.q0014;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    int minLength = Integer.MAX_VALUE;

    var stringBuilder = new StringBuilder();

    if (strs.length == 0) {
      return "";
    }

    for (String s : strs) {
      if (s.length() < minLength) {
        minLength = s.length();
      }
    }

    for (int i = 0; i < minLength; i++) {
      char toMatch = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].charAt(i) != toMatch) {
          return stringBuilder.toString();
        }
      }
      stringBuilder.append(toMatch);
    }
    return stringBuilder.toString();
  }
}
