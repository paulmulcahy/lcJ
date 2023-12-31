package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0018;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourSumTest {

  @Test
  public void example1Test() {
    final int[] input = {1, 0, -1, 0, -2, 2};
    final int inputTarget = 0;
    final List<List<Integer>> expected =
        List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
    final List<List<Integer>> actual = FourSum.fourSum(input, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int[] input = {2, 2, 2, 2, 2};
    final int inputTarget = 8;
    final List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2));
    final List<List<Integer>> actual = FourSum.fourSum(input, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    final int[] input = {1000000000, 1000000000, 1000000000, 1000000000};
    final int inputTarget = -294967296;
    final List<List<Integer>> expected = List.of();
    final List<List<Integer>> actual = FourSum.fourSum(input, inputTarget);
    Assertions.assertEquals(expected, actual);
  }
}
