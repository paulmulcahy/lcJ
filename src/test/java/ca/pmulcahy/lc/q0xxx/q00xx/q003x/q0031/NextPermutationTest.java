package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0031;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextPermutationTest {

  @Test
  public void example1Test() {
    int[] input = {1, 2, 3};
    int[] expected = {1, 3, 2};
    NextPermutation.nextPermutation(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  public void example2Test() {
    int[] input = {3, 2, 1};
    int[] expected = {1, 2, 3};
    NextPermutation.nextPermutation(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  public void example3Test() {
    int[] input = {1, 1, 5};
    int[] expected = {1, 5, 1};
    NextPermutation.nextPermutation(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  public void lc1Test() {
    int[] input = {2, 3, 1};
    int[] expected = {3, 1, 2};
    NextPermutation.nextPermutation(input);
    Assertions.assertArrayEquals(expected, input);
  }
}
