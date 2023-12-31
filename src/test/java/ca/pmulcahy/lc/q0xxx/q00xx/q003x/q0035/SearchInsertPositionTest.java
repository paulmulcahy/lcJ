package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0035;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

  @Test
  public void example1Test() {
    int[] inputNums = {1, 3, 5, 6};
    int inputTarget = 5;
    int expected = 2;
    int actual = SearchInsertPosition.searchInsert(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int[] inputNums = {1, 3, 5, 6};
    int inputTarget = 2;
    int expected = 1;
    int actual = SearchInsertPosition.searchInsert(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    int[] inputNums = {1, 3, 5, 6};
    int inputTarget = 7;
    int expected = 4;
    int actual = SearchInsertPosition.searchInsert(inputNums, inputTarget);
    Assertions.assertEquals(expected, actual);
  }
}
