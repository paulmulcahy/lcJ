package ca.pmulcahy.lc.q0001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

  @Test
  public void example1Test() {
    int[] inputNums = {2, 7, 11, 15};
    int inputTarget = 9;

    int[] expected = {0, 1};
    int[] actual = TwoSum.twoSum(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int[] inputNums = {3, 2, 4};
    int inputTarget = 6;

    int[] expected = {1, 2};
    int[] actual = TwoSum.twoSum(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    int[] inputNums = {3, 3};
    int inputTarget = 6;

    int[] expected = {0, 1};
    int[] actual = TwoSum.twoSum(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }
}
