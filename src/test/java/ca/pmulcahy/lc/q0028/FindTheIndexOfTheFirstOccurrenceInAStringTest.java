package ca.pmulcahy.lc.q0028;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

  @Test
  public void example1Test() {
    String inputHayStack = "sadbutsad";
    String inputNeedle = "sad";
    int expected = 0;
    int actual = FindTheIndexOfTheFirstOccurrenceInAString.strStr(inputHayStack, inputNeedle);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    String inputHayStack = "leetcode";
    String inputNeedle = "leeto";
    int expected = -1;
    int actual = FindTheIndexOfTheFirstOccurrenceInAString.strStr(inputHayStack, inputNeedle);
    Assertions.assertEquals(expected, actual);
  }
}
