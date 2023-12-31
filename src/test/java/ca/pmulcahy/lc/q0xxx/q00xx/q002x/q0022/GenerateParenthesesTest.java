package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0022;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateParenthesesTest {

  @Test
  public void example1Test() {
    final int input = 3;
    final List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
    final List<String> actual = GenerateParentheses.generateParenthesis(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int input = 1;
    final List<String> expected = List.of("()");
    final List<String> actual = GenerateParentheses.generateParenthesis(input);
    Assertions.assertEquals(expected, actual);
  }
}
