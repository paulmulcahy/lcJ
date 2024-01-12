package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Given an array of distinct integers candidates and a target integer target,
return a list of all unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that
sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);

    int[] currNums = new int[candidates.length];

    List<int[]> combinationsSums =
        combinationSum(candidates, target, candidates.length - 1, 0, currNums);

    List<List<Integer>> toReturn =
        combinationsSums.stream().map(t -> convert(t, candidates)).collect(Collectors.toList());

    return toReturn;
  }

  private static List<Integer> convert(int[] combinationSums, int[] candidates) {
    List<Integer> toReturn = new ArrayList<>();
    for (int i = 0; i < candidates.length; i++) {
      for (int j = 0; j < combinationSums[i]; j++) {
        toReturn.add(candidates[i]);
      }
    }
    return toReturn;
  }

  private static List<int[]> combinationSum(
      int[] candidates, int target, int currArrIndex, int currSum, int[] currNums) {
    List<int[]> toReturn = new ArrayList<>();
    if (currArrIndex < 0) {
      return Collections.emptyList();
    }
    int val = candidates[currArrIndex];
    while (currSum < target) {
      toReturn.addAll(combinationSum(candidates, target, currArrIndex - 1, currSum, currNums));
      currSum += val;
      currNums[currArrIndex]++;
    }
    if (currSum == target) {
      toReturn.add(Arrays.copyOf(currNums, currNums.length));
    }

    currNums[currArrIndex] = 0;
    return toReturn;
  }
}
