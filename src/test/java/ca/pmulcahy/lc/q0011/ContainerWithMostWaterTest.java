package ca.pmulcahy.lc.q0011;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

  @Test
  public void example1Test() {
    final int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    final int expected = 49;
    final int actual = ContainerWithMostWater.maxArea(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int[] input = {1, 1};
    final int expected = 1;
    final int actual = ContainerWithMostWater.maxArea(input);
    Assertions.assertEquals(expected, actual);
  }
}
