package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0005;

public class LongestPalindromicSubstring {
  public static String longestPalindrome(String s) {

    int longestPalindromicLength = 0;
    int longestPalindromicStart = 0;

    // even length palindromes
    for (int i = 0; i < s.length() - 1; i++) {
      int stringIndexBoundaries = Math.min(i - 0, s.length() - i - 2);
      int sideCharToCheckForMatch = 0;

      while (sideCharToCheckForMatch <= stringIndexBoundaries
          && s.charAt(i - sideCharToCheckForMatch) == s.charAt(i + 1 + sideCharToCheckForMatch)) {
        sideCharToCheckForMatch++;
      }
      int palindromicStart = i - sideCharToCheckForMatch + 1;
      int palindromicLength = 2 + ((sideCharToCheckForMatch - 1) * 2);

      if (palindromicLength > longestPalindromicLength) {
        longestPalindromicLength = palindromicLength;
        longestPalindromicStart = palindromicStart;
      }
    }

    // odd length palindromes
    for (int i = 0; i < s.length(); i++) {
      int stringIndexBoundaries = Math.min(i - 0, s.length() - i - 1);
      int sideCharToCheckForMatch = 1;

      while (sideCharToCheckForMatch <= stringIndexBoundaries
          && s.charAt(i - sideCharToCheckForMatch) == s.charAt(i + sideCharToCheckForMatch)) {
        sideCharToCheckForMatch++;
      }
      int palindromicStart = i - sideCharToCheckForMatch + 1;
      int palindromicLength = 1 + ((sideCharToCheckForMatch - 1) * 2);

      if (palindromicLength > longestPalindromicLength) {
        longestPalindromicLength = palindromicLength;
        longestPalindromicStart = palindromicStart;
      }
    }

    return s.substring(longestPalindromicStart, longestPalindromicStart + longestPalindromicLength);
  }
}
