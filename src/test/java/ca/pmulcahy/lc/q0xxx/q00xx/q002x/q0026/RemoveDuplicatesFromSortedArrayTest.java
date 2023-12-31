package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0026;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveDuplicatesFromSortedArrayTest {
  private void assertArray(int[] expected, int[] actual, int k) {
    Assertions.assertEquals(expected.length, k);

    for (int i = 0; i < k; i++) {
      Assertions.assertEquals(expected[i], actual[i]);
    }
  }

  @Test
  public void example1Test() {
    int[] input = {1, 1, 2};
    int actual = RemoveDuplicatesFromSortedArray.removeDuplicates(input);
    int[] expected = {1, 2};
    assertArray(expected, input, actual);
  }

  @Test
  public void example2Test() {
    int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int actual = RemoveDuplicatesFromSortedArray.removeDuplicates(input);
    int[] expected = {0, 1, 2, 3, 4};
    assertArray(expected, input, actual);
  }
}
