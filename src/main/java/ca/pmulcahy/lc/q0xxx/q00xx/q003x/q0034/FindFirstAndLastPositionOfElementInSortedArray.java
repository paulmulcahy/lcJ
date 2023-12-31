package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0034;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

  static final int[] EMPTY = new int[] {-1, -1};

  public static int[] searchRange(int[] nums, int target) {
    if (nums.length == 0) {
      return EMPTY;
    }
    int startIndex = binarySearchLeftmost(nums, target);
    if (startIndex > nums.length - 1 || nums[startIndex] != target) {
      return EMPTY;
    }
    int endIndex = binarySearchRightmost(nums, target);

    return new int[] {startIndex, endIndex};
  }

  private static int binarySearchLeftmost(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      int middle = (left + right) / 2;
      if (nums[middle] < target) {
        left = middle + 1;
      } else {
        right = middle;
      }
    }
    return left;
  }

  private static int binarySearchRightmost(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      int middle = (left + right) / 2;
      if (nums[middle] > target) {
        right = middle;
      } else {
        left = middle + 1;
      }
    }
    return right - 1;
  }
}
