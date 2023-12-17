package ca.pmulcahy.lc.q0016;

import java.util.Arrays;

/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {
  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closestToTarget = twoSum(nums, 0, target);
    int closestToTargetDiff = Math.abs(target - closestToTarget);
    for (int i = 1; i < nums.length - 2; i++) {
      int closeToTarget = twoSum(nums, i, target);
      int closeToTargetDiff = Math.abs(target - closeToTarget);
      if (closeToTargetDiff < closestToTargetDiff) {
        closestToTargetDiff = closeToTargetDiff;
        closestToTarget = closeToTarget;
      }
    }
    return closestToTarget;
  }

  public static int twoSum(int[] nums, int startCounter, int target) {
    int closestToTarget = nums[0] + nums[1] + nums[2];
    int closestToTargetDiff = Math.abs(target - closestToTarget);

    int sum = nums[startCounter];

    int lowCounter = startCounter + 1;
    int highCounter = nums.length - 1;

    while (lowCounter < highCounter) {
      int lowNum = nums[lowCounter];
      int highNum = nums[highCounter];
      int threeSum = highNum + lowNum + sum;
      if (threeSum < target) {
        int diff = target - threeSum;
        if (diff < closestToTargetDiff) {
          closestToTargetDiff = diff;
          closestToTarget = threeSum;
        }
        do {
          lowCounter++;
        } while (lowCounter < highCounter && nums[lowCounter] == lowNum);
      } else if (threeSum > target) {
        int diff = threeSum - target;
        if (diff < closestToTargetDiff) {
          closestToTargetDiff = diff;
          closestToTarget = threeSum;
        }
        do {
          highCounter--;
        } while (lowCounter < highCounter && nums[highCounter] == highNum);
      } else {
        // threeSum == target
        return threeSum;
      }
    }
    return closestToTarget;
  }
}
