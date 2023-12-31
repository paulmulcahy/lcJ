package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

  @Test
  public void example1Test() {
    String input = "abcabcbb";

    int expected = 3;
    int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    String input = "bbbbb";

    int expected = 1;
    int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    String input = "pwwkew";

    int expected = 3;
    int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    String input = "aab";

    int expected = 2;
    int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    String input = "jbpnbwwd";

    int expected = 4;
    int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }
}
