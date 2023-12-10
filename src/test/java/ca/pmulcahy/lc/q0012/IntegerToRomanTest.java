package ca.pmulcahy.lc.q0012;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

  @Test
  public void example1Test() {
    final int input = 3;
    final String expected = "III";
    final String actual = IntegerToRoman.intToRoman(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int input = 58;
    final String expected = "LVIII";
    final String actual = IntegerToRoman.intToRoman(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final int input = 1994;
    final String expected = "MCMXCIV";
    final String actual = IntegerToRoman.intToRoman(input);
    Assertions.assertEquals(expected, actual);
  }
}
