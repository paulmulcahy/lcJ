package ca.pmulcahy.lc.q0028;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
  public static int strStr(String haystack, String needle) {
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      int matchingChars = 0;
      while (matchingChars < needle.length()
          && haystack.charAt(i + matchingChars) == needle.charAt(matchingChars)) {
        matchingChars++;
      }
      if (matchingChars == needle.length()) {
        return i;
      }
    }
    return -1;
  }
}
