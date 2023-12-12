package ca.pmulcahy.lc.q0013;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

  @Test
  public void example1Test() {
    final String input = "III";
    final int expected = 3;
    final int actual = RomanToInteger.romanToInt(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final String input = "LVIII";
    final int expected = 58;
    final int actual = RomanToInteger.romanToInt(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final String input = "MCMXCIV";
    final int expected = 1994;
    final int actual = RomanToInteger.romanToInt(input);
    Assertions.assertEquals(expected, actual);
  }
}
