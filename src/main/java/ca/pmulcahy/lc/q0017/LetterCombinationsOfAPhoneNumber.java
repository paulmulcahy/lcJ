package ca.pmulcahy.lc.q0017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

  public static String[][] CHARS = {
    {"a", "b", "c"},
    {"d", "e", "f"},
    {"g", "h", "i"},
    {"j", "k", "l"},
    {"m", "n", "o"},
    {"p", "q", "r", "s"},
    {"t", "u", "v"},
    {"w", "x", "y", "z"}
  };

  public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
      return Collections.emptyList();
    }
    return letterCombinations(digits, 0);
  }

  private static List<String> letterCombinations(String digits, int index) {

    List<String> combinations = new ArrayList<>();
    char digit = digits.charAt(index);
    int num = Character.getNumericValue(digit);

    if (index < digits.length() - 1) {
      List<String> nextLetterCombinations = letterCombinations(digits, index + 1);

      for (String currentLetter : CHARS[num - 2]) {
        for (String nextLetterCombination : nextLetterCombinations) {
          combinations.add(currentLetter + nextLetterCombination);
        }
      }
    } else {
      for (String currentLetter : CHARS[num - 2]) {
        combinations.add(currentLetter);
      }
    }
    return combinations;
  }
}
