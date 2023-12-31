package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0033;

public class SearchInRotatedSortedArray {
  public static int search(int[] nums, int target) {
    final int offset = getOffset(nums);
    final int length = nums.length;

    int lower = 0;
    int higher = length - 1;

    while (lower <= higher) {
      int middle = (higher + lower) / 2;
      int middleOffsetIndex = getOffsetIndex(length, offset, middle);
      if (nums[middleOffsetIndex] == target) {
        return middleOffsetIndex;
      } else if (nums[middleOffsetIndex] < target) {
        lower = middle + 1;
      } else {
        higher = middle - 1;
      }
    }
    return -1;
  }

  private static int getOffsetIndex(int length, int offset, int index) {
    return (index + offset) % length;
  }

  /*private static int getOffset(int[] nums) {
  	int lower = 0;
  	int higher = nums.length - 1;

  	while(higher - lower > 1) {
  		int middle = (higher + lower) / 2;
  		if(nums[lower] < nums[middle]) {
  			lower = middle;
  		} else {
  			higher = middle;
  		}
  	}
  	if(nums[higher] > nums[lower]) {
  		return lower;
  	}
  	return higher;
  }*/

  private static int getOffset(int[] nums) {
    int lower = 0;
    int higher = nums.length - 1;
    if (nums[lower] < nums[higher]) {
      return 0;
    }

    while (higher - lower > 1) {
      int middle = (higher + lower) / 2;
      if (nums[lower] < nums[middle]) {
        lower = middle;
      } else {
        higher = middle;
      }
    }
    return higher;
  }
}
