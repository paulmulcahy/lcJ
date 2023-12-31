package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0026;

public class RemoveDuplicatesFromSortedArray {
  public static int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int last = nums[0];
    int insertCounter = 1;
    int pullCounter = 1;
    while (pullCounter < nums.length) {
      if (nums[pullCounter] != last) {
        last = nums[pullCounter];
        nums[insertCounter] = nums[pullCounter];
        insertCounter++;
      }
      pullCounter++;
    }
    return insertCounter;
  }
}
