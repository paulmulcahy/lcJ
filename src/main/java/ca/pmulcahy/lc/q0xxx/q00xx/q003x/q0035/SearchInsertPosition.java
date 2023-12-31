package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0035;

public class SearchInsertPosition {
  public static int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int middle = (low + high) / 2;
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] < target) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }

    return low;
  }
}
