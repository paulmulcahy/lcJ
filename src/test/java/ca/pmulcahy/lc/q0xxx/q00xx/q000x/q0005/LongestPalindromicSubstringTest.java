package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

  @Test
  public void example1Test() {
    final String input = "babad";
    final String expected = "bab";
    final String actual = LongestPalindromicSubstring.longestPalindrome(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final String input = "cbbd";
    final String expected = "bb";
    final String actual = LongestPalindromicSubstring.longestPalindrome(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    final String input = "ac";
    final String expected = "a";
    final String actual = LongestPalindromicSubstring.longestPalindrome(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    final String input = "ccc";
    final String expected = "ccc";
    final String actual = LongestPalindromicSubstring.longestPalindrome(input);
    Assertions.assertEquals(expected, actual);
  }
}
