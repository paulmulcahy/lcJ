package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

  @Test
  public void example1Test() {
    final String input = "()";
    final boolean actual = ValidParentheses.isValid(input);
    Assertions.assertTrue(actual);
  }

  @Test
  public void example2Test() {
    final String input = "()[]{}";
    final boolean actual = ValidParentheses.isValid(input);
    Assertions.assertTrue(actual);
  }

  @Test
  public void example3Test() {
    final String input = "(]";
    final boolean actual = ValidParentheses.isValid(input);
    Assertions.assertFalse(actual);
  }
}
