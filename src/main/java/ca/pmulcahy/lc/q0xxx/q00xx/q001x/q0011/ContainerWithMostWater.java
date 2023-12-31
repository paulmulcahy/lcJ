package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0011;

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
  public static int maxArea(int[] height) {
    int maxVolume = 0;

    int leftCounter = 0;
    int rightCounter = height.length - 1;

    while (leftCounter < rightCounter) {
      final int leftHeight = height[leftCounter];
      final int rightHeight = height[rightCounter];
      final int length = Math.min(leftHeight, rightHeight);
      final int span = rightCounter - leftCounter;
      final int volume = length * span;
      if (volume > maxVolume) {
        maxVolume = volume;
      }
      if (leftHeight > rightHeight) {
        rightCounter--;
      } else {
        leftCounter++;
      }
    }

    return maxVolume;
  }
}
