package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

  public static List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> toReturn = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 3; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        for (int j = i + 1; j < nums.length - 2; j++) {
          if (j == i + 1 || nums[j] != nums[j - 1]) {
            toReturn.addAll(twoSum(nums, target, j + 1, nums[i], nums[j]));
          }
        }
      }
    }
    return toReturn;
  }

  public static List<List<Integer>> twoSum(
      int[] nums, int target, int startingIndex, int val1, int val2) {
    List<List<Integer>> toReturn = new ArrayList<>();

    long currentSum = val1 + val2;
    int lowCounter = startingIndex;
    int highCounter = nums.length - 1;

    while (lowCounter < highCounter) {
      int lowVal = nums[lowCounter];
      int highVal = nums[highCounter];
      if (lowVal + highVal + currentSum < target) {
        do {
          lowCounter++;
        } while (lowCounter < highCounter && nums[lowCounter] == lowVal);
      } else if (lowVal + highVal + currentSum > target) {
        do {
          highCounter--;
        } while (lowCounter < highCounter && nums[highCounter] == highVal);
      } else {
        // == target
        List<Integer> sumToTarget = List.of(val1, val2, lowVal, highVal);
        toReturn.add(sumToTarget);
        do {
          lowCounter++;
        } while (lowCounter < highCounter && nums[lowCounter] == lowVal);
      }
    }
    return toReturn;
  }
}
