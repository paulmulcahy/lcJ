package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0010;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegularExpressionMatchingTest {

  @Test
  public void example1Test() {
    final String inputS = "aa";
    final String inputP = "a";
    final boolean actual = RegularExpressionMatching.isMatch(inputS, inputP);
    Assertions.assertFalse(actual);
  }

  @Test
  public void example2Test() {
    final String inputS = "aa";
    final String inputP = "a*";
    final boolean actual = RegularExpressionMatching.isMatch(inputS, inputP);
    Assertions.assertTrue(actual);
  }

  @Test
  public void example3Test() {
    final String inputS = "ab";
    final String inputP = ".*";
    final boolean actual = RegularExpressionMatching.isMatch(inputS, inputP);
    Assertions.assertTrue(actual);
  }

  @Test
  public void lc1Test() {
    final String inputS = "aab";
    final String inputP = "c*a*b";
    final boolean actual = RegularExpressionMatching.isMatch(inputS, inputP);
    Assertions.assertTrue(actual);
  }

  @Test
  public void lc2Test() {
    final String inputS = "a";
    final String inputP = "ab*";
    final boolean actual = RegularExpressionMatching.isMatch(inputS, inputP);
    Assertions.assertTrue(actual);
  }
}
