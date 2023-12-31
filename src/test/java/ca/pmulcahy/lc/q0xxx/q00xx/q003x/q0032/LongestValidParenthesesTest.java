package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0032;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {

  @Test
  public void example1Test() {
    String input = "(()";
    int expected = 2;
    int actual = LongestValidParentheses.longestValidParentheses(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    String input = ")()())";
    int expected = 4;
    int actual = LongestValidParentheses.longestValidParentheses(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    String input = "";
    int expected = 0;
    int actual = LongestValidParentheses.longestValidParentheses(input);
    Assertions.assertEquals(expected, actual);
  }
}
