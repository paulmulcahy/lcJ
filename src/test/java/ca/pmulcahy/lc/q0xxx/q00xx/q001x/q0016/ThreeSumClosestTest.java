package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0016;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {

  @Test
  public void example1Test() {
    final int[] input = {-1, 2, 1, -4};
    final int inputTarget = 1;
    final int expected = 2;
    final int actual = ThreeSumClosest.threeSumClosest(input, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int[] input = {0, 0, 0};
    final int inputTarget = 1;
    final int expected = 0;
    final int actual = ThreeSumClosest.threeSumClosest(input, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    final int[] input = {0, 1, 2};
    final int inputTarget = 0;
    final int expected = 3;
    final int actual = ThreeSumClosest.threeSumClosest(input, inputTarget);
    Assertions.assertEquals(expected, actual);
  }
}
