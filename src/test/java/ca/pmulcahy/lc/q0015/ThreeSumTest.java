package ca.pmulcahy.lc.q0015;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {

  @Test
  public void example1Test() {
    final int[] input = {-1, 0, 1, 2, -1, -4};
    final List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
    final List<List<Integer>> actual = ThreeSum.threeSum(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int[] input = {0, 1, 1};
    final List<List<Integer>> expected = List.of();
    final List<List<Integer>> actual = ThreeSum.threeSum(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final int[] input = {0, 0, 0};
    final List<List<Integer>> expected = List.of(List.of(0, 0, 0));
    final List<List<Integer>> actual = ThreeSum.threeSum(input);
    Assertions.assertEquals(expected, actual);
  }
}
