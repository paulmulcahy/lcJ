package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0004;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 */
public class MedianOfTwoSortedArrays {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int totalCount = nums1.length + nums2.length;
    boolean avgTwo;
    int medianIndex;

    if (totalCount % 2 == 0) {
      avgTwo = true;
      medianIndex = (totalCount - 1) / 2;
    } else {
      avgTwo = false;
      medianIndex = totalCount / 2;
    }

    int nums1Counter = 0;
    int nums2Counter = 0;

    while ((nums1Counter + nums2Counter) < medianIndex) {
      if (isFirstArrVallLarger(nums1, nums2, nums1Counter, nums2Counter)) {
        nums1Counter++;
      } else {
        nums2Counter++;
      }
    }

    int firstMedian;
    double median;

    if (isFirstArrVallLarger(nums1, nums2, nums1Counter, nums2Counter)) {
      firstMedian = nums1[nums1Counter++];
    } else {
      firstMedian = nums2[nums2Counter++];
    }

    if (avgTwo) {
      int secondMedian;

      if (isFirstArrVallLarger(nums1, nums2, nums1Counter, nums2Counter)) {
        secondMedian = nums1[nums1Counter];
      } else {
        secondMedian = nums2[nums2Counter];
      }
      median = (firstMedian + secondMedian) / 2.0;
    } else {
      median = firstMedian;
    }
    return median;
  }

  private static boolean isFirstArrVallLarger(
      int[] nums1, int[] nums2, int nums1Counter, int nums2Counter) {
    if (nums1Counter < nums1.length && nums2Counter < nums2.length) {
      return nums1[nums1Counter] < nums2[nums2Counter];
    }
    return nums1Counter < nums1.length;
  }
}
