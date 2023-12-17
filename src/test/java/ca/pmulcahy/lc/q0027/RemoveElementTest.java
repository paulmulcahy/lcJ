package ca.pmulcahy.lc.q0027;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

  private void assertArray(int[] expected, int[] actual, int k) {
    Assertions.assertEquals(expected.length, k);

    for (int i = 0; i < k; i++) {
      Assertions.assertEquals(expected[i], actual[i]);
    }
  }

  @Test
  public void example1Test() {
    int[] input = {3, 2, 2, 3};
    int inputVal = 3;
    int[] expected = {2, 2};
    int actual = RemoveElement.removeElement(input, inputVal);
    assertArray(expected, input, actual);
  }

  @Test
  public void example2Test() {
    int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
    int inputVal = 2;
    int[] expected = {0, 1, 3, 0, 4};
    int actual = RemoveElement.removeElement(input, inputVal);
    assertArray(expected, input, actual);
  }
}
