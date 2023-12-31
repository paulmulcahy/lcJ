package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0017;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCombinationsOfAPhoneNumberTest {

  @Test
  public void example1Test() {
    final String input = "23";
    final List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    final List<String> actual = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final String input = "";
    final List<String> expected = List.of();
    final List<String> actual = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final String input = "2";
    final List<String> expected = List.of("a", "b", "c");
    final List<String> actual = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
    Assertions.assertEquals(expected, actual);
  }
}
