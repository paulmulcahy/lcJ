package ca.pmulcahy.lc.q0014;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

  @Test
  public void example1Test() {
    final String[] input = {"flower", "flow", "flight"};
    final String expected = "fl";
    final String actual = LongestCommonPrefix.longestCommonPrefix(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final String[] input = {"dog", "racecar", "car"};
    final String expected = "";
    final String actual = LongestCommonPrefix.longestCommonPrefix(input);
    Assertions.assertEquals(expected, actual);
  }
}
