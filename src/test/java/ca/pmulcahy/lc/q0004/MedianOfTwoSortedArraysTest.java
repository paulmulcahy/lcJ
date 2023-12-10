package ca.pmulcahy.lc.q0004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArraysTest {

  @Test
  public void example1Test() {
    final int[] nums1 = {1, 3};
    final int[] nums2 = {2};

    final double expected = 2.0;
    final double actual = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final int[] nums1 = {1, 2};
    final int[] nums2 = {3, 4};

    final double expected = 2.5;
    final double actual = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
    Assertions.assertEquals(expected, actual);
  }
}
