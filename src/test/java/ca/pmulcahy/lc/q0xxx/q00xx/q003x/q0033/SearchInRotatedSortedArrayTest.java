package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0033;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {

  @Test
  public void example1Test() {
    int[] inputNums = {4, 5, 6, 7, 0, 1, 2};
    int inputTarget = 0;
    int expected = 4;
    int actual = SearchInRotatedSortedArray.search(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int[] inputNums = {4, 5, 6, 7, 0, 1, 2};
    int inputTarget = 3;
    int expected = -1;
    int actual = SearchInRotatedSortedArray.search(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    int[] inputNums = {1};
    int inputTarget = 0;
    int expected = -1;
    int actual = SearchInRotatedSortedArray.search(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    int[] inputNums = {1, 3};
    int inputTarget = 1;
    int expected = 0;
    int actual = SearchInRotatedSortedArray.search(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    int[] inputNums = {3, 1};
    int inputTarget = 1;
    int expected = 1;
    int actual = SearchInRotatedSortedArray.search(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc3Test() {
    int[] inputNums = {1, 3, 5};
    int inputTarget = 1;
    int expected = 0;
    int actual = SearchInRotatedSortedArray.search(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }
}
