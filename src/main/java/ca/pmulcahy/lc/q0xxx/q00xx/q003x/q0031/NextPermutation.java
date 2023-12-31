package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0031;

/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
More formally, if all the permutations of the array are sorted in one container according to their lexicographical order,
then the next permutation of that array is the permutation that follows it in the sorted container.
If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

The steps are the following:

1. Find the break-point, i: Break-point means the first index i from the back of the given array where arr[i] becomes smaller than arr[i+1].
For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(0-based indexing). Here from the back of the array, index 1 is the first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.

2. To find the break-point, using a loop we will traverse the array backward and store the index i where arr[i] is less than the value at index (i+1) i.e. arr[i+1].
If such a break-point does not exist i.e. if the array is sorted in decreasing order, the given permutation is the last one in the sorted order of all possible permutations. So, the next permutation must be the first i.e. the permutation in increasing order.
So, in this case, we will reverse the whole array and will return it as our answer.

3. If a break-point exists:
Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) and swap it with arr[i].
Reverse the entire right half(i.e. from index i+1 to n-1) of index i. And finally, return the array.
 */
public class NextPermutation {

  private static final int NO_BREAKPOINT = -1;

  public static void nextPermutation(int[] nums) {
    final int breakpoint = findBreakpoint(nums);
    if (breakpoint == NO_BREAKPOINT) {
      reverse(nums, 0);
    } else {
      final int smallestIndexRightOfBreakpoint =
          getSmallestIndexRightOfBreakpoint(nums, breakpoint);
      swapElements(nums, breakpoint, smallestIndexRightOfBreakpoint);
      reverse(nums, breakpoint + 1);
    }
  }

  private static int findBreakpoint(int[] nums) {
    int rightElement = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      int leftElement = nums[i];
      if (leftElement < rightElement) {
        return i;
      }
      rightElement = leftElement;
    }
    // no breakpoint, return magic num
    return NO_BREAKPOINT;
  }

  private static int getSmallestIndexRightOfBreakpoint(int[] nums, int breakpoint) {
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] > nums[breakpoint]) {
        return i;
      }
    }
    // should never occur
    return NO_BREAKPOINT;
  }

  private static void swapElements(int[] nums, int i, int j) {
    int swap = nums[i];
    nums[i] = nums[j];
    nums[j] = swap;
  }

  private static void reverse(int[] nums, int startIndex) {
    int left = startIndex;
    int right = nums.length - 1;
    while (left < right) {
      swapElements(nums, left, right);
      left++;
      right--;
    }
  }
}
