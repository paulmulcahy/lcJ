package ca.pmulcahy.lc.q0010;

/*
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).
 */

// TODO: how to make faster?
public class RegularExpressionMatching {
  public static boolean isMatch(String s, String p) {
    if (s.isEmpty() && p.isEmpty()) {
      return true;
    }
    return isRegExpMatch(s, p, 0, 0);
  }

  private static boolean isRegExpMatch(String s, String p, int sCounter, int pCounter) {
    if (sCounter == s.length()) {
      if ((p.length() - pCounter) % 2 == 0) {
        for (int i = pCounter + 1; i < p.length(); i += 2) {
          if (p.charAt(i) != '*') {
            return false;
          }
        }
        return true;
      }
    }
    if (sCounter == s.length() && pCounter == p.length()) {
      return true;
    }
    if (sCounter >= s.length() || pCounter >= p.length()) {
      return false;
    }
    boolean nextElementRepetition = pCounter != p.length() - 1 && p.charAt(pCounter + 1) == '*';
    if (nextElementRepetition) {
      char thisElement = p.charAt(pCounter);
      boolean thisElementWild = thisElement == '.';
      if (thisElementWild) {
        for (int i = sCounter; i <= s.length(); i++) {
          if (isRegExpMatch(s, p, i, pCounter + 2)) {
            return true;
          }
        }
        return false;
      }
      int i = sCounter;
      while (i < s.length() && s.charAt(i) == thisElement) {
        if (isRegExpMatch(s, p, i, pCounter + 2)) {
          return true;
        }
        i++;
      }
      if (isRegExpMatch(s, p, i, pCounter + 2)) {
        return true;
      }
      return false;
    }
    if (s.charAt(sCounter) == p.charAt(pCounter) || p.charAt(pCounter) == '.') {
      return (isRegExpMatch(s, p, sCounter + 1, pCounter + 1));
    }
    return false;
  }
}
