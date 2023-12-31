package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> toReturn = new ArrayList<>();

    Arrays.sort(nums);

    int prev = nums[0];
    toReturn.addAll(twoSum(nums, 0));

    for (int i = 1; i < nums.length - 2; i++) {
      int curr = nums[i];
      if (curr != prev) {
        toReturn.addAll(twoSum(nums, i));
        prev = curr;
      }
    }

    return toReturn;
  }

  public static List<List<Integer>> twoSum(int[] nums, int startCounter) {
    List<List<Integer>> toReturn = new ArrayList<>();

    int sum = nums[startCounter];

    int lowCounter = startCounter + 1;
    int highCounter = nums.length - 1;

    while (lowCounter < highCounter) {
      int lowNum = nums[lowCounter];
      int highNum = nums[highCounter];
      if (highNum + lowNum + sum < 0) {
        do {
          lowCounter++;
        } while (lowCounter < highCounter && nums[lowCounter] == lowNum);
      } else if (highNum + lowNum + sum > 0) {
        do {
          highCounter--;
        } while (lowCounter < highCounter && nums[highCounter] == highNum);
      } else {
        if (sum < lowNum) {
          toReturn.add(List.of(sum, lowNum, highNum));
        } else if (sum > highNum) {
          toReturn.add(List.of(lowNum, highNum, sum));
        } else {
          toReturn.add(List.of(lowNum, sum, highNum));
        }
        do {
          lowCounter++;
        } while (lowCounter < highCounter && nums[lowCounter] == lowNum);
      }
    }
    return toReturn;
  }
}
