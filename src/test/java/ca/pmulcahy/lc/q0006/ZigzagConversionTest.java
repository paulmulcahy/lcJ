package ca.pmulcahy.lc.q0006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigzagConversionTest {

  @Test
  public void example1Test() {
    final String inputString = "PAYPALISHIRING";
    final int inputNumRows = 3;
    final String expected = "PAHNAPLSIIGYIR";
    final String actual = ZigzagConversion.convert(inputString, inputNumRows);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final String inputString = "PAYPALISHIRING";
    final int inputNumRows = 4;
    final String expected = "PINALSIGYAHRPI";
    final String actual = ZigzagConversion.convert(inputString, inputNumRows);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final String inputString = "A";
    final int inputNumRows = 1;
    final String expected = "A";
    final String actual = ZigzagConversion.convert(inputString, inputNumRows);
    Assertions.assertEquals(expected, actual);
  }
}
