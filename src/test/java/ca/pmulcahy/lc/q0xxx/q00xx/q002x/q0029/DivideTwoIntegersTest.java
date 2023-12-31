package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTwoIntegersTest {

  @Test
  public void example1Test() {
    int inputDividend = 10;
    int inputDivisor = 3;
    int expected = 3;
    int actual = DivideTwoIntegers.divide(inputDividend, inputDivisor);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int inputDividend = 7;
    int inputDivisor = -3;
    int expected = -2;
    int actual = DivideTwoIntegers.divide(inputDividend, inputDivisor);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    int inputDividend = 1;
    int inputDivisor = 1;
    int expected = 1;
    int actual = DivideTwoIntegers.divide(inputDividend, inputDivisor);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    int inputDividend = -2147483648;
    int inputDivisor = -1;
    int expected = 2147483647;
    int actual = DivideTwoIntegers.divide(inputDividend, inputDivisor);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc3Test() {
    int inputDividend = -2147483648;
    int inputDivisor = 1;
    int expected = -2147483648;
    int actual = DivideTwoIntegers.divide(inputDividend, inputDivisor);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc4Test() {
    int inputDividend = -2147483648;
    int inputDivisor = 2;
    int expected = -1073741824;
    int actual = DivideTwoIntegers.divide(inputDividend, inputDivisor);
    Assertions.assertEquals(expected, actual);
  }
}
