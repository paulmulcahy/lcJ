package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0007;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

  @Test
  public void example1Test() {
    final int input = 123;
    final int expected = 321;
    final int actual = ReverseInteger.reverse(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int input = -123;
    final int expected = -321;
    final int actual = ReverseInteger.reverse(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final int input = 120;
    final int expected = 21;
    final int actual = ReverseInteger.reverse(input);
    Assertions.assertEquals(expected, actual);
  }
}
