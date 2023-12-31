package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0027;

public class RemoveElement {
  public static int removeElement(int[] nums, int val) {
    int pullIndex = 0;
    int putIndex = 0;
    while (pullIndex != nums.length) {
      if (nums[pullIndex] != val) {
        nums[putIndex] = nums[pullIndex];
        putIndex++;
      }
      pullIndex++;
    }
    return putIndex;
  }
}
