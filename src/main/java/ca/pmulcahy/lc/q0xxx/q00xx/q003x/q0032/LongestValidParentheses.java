package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0032;

/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.
 */
public class LongestValidParentheses {
  public static int longestValidParentheses(String s) {
    int longestSoFar = 0;
    int counter = 0;

    // could be optimized by keeping index of well formed indexes and not starting counts from there
    // (but this passes!)
    while (counter < s.length() - 1) {
      if (s.charAt(counter) == '(') {
        int openParenthesesCount = 1;
        int closedParenthesesCount = 0;
        int innerCounter = 1;
        while (counter + innerCounter < s.length()
            && closedParenthesesCount <= openParenthesesCount) {
          if (s.charAt(counter + innerCounter) == '(') {
            openParenthesesCount++;
          } else {
            closedParenthesesCount++;
          }
          innerCounter++;
          if (openParenthesesCount == closedParenthesesCount && innerCounter > longestSoFar) {
            longestSoFar = innerCounter;
          }
        }
      }
      counter++;
    }
    return longestSoFar;
  }
}
