package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0034;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

  @Test
  public void example1Test() {
    int[] inputNums = {5, 7, 7, 8, 8, 10};
    int inputTarget = 8;
    int[] expected = {3, 4};
    int[] actual =
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int[] inputNums = {5, 7, 7, 8, 8, 10};
    int inputTarget = 6;
    int[] expected = {-1, -1};
    int[] actual =
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    int[] inputNums = {};
    int inputTarget = 0;
    int[] expected = {-1, -1};
    int[] actual =
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    int[] inputNums = {1};
    int inputTarget = 1;
    int[] expected = {0, 0};
    int[] actual =
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    int[] inputNums = {2, 2};
    int inputTarget = 2;
    int[] expected = {0, 1};
    int[] actual =
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void lc3Test() {
    int[] inputNums = {2, 2};
    int inputTarget = 3;
    int[] expected = {-1, -1};
    int[] actual =
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(inputNums, inputTarget);
    Assertions.assertArrayEquals(expected, actual);
  }
}
