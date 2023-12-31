package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0030;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubstringWithConcatenationOfAllWordsTest {

  @Test
  public void example1Test() {
    String inputS = "barfoothefoobarman";
    String[] inputWords = {"foo", "bar"};
    List<Integer> expected = List.of(0, 9);
    List<Integer> actual = SubstringWithConcatenationOfAllWords.findSubstring(inputS, inputWords);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    String inputS = "wordgoodgoodgoodbestword";
    String[] inputWords = {"word", "good", "best", "word"};
    List<Integer> expected = List.of();
    List<Integer> actual = SubstringWithConcatenationOfAllWords.findSubstring(inputS, inputWords);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    String inputS = "barfoofoobarthefoobarman";
    String[] inputWords = {"bar", "foo", "the"};
    List<Integer> expected = List.of(6, 9, 12);
    List<Integer> actual = SubstringWithConcatenationOfAllWords.findSubstring(inputS, inputWords);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    String inputS = "wordgoodgoodgoodbestword";
    String[] inputWords = {"word", "good", "best", "good"};
    List<Integer> expected = List.of(8);
    List<Integer> actual = SubstringWithConcatenationOfAllWords.findSubstring(inputS, inputWords);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    String inputS = "aaa";
    String[] inputWords = {"a", "a"};
    List<Integer> expected = List.of(0, 1);
    List<Integer> actual = SubstringWithConcatenationOfAllWords.findSubstring(inputS, inputWords);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc3Test() {
    String inputS = "abaababbaba";
    String[] inputWords = {"ab", "ba", "ab", "ba"};
    List<Integer> expected = List.of(1, 3);
    List<Integer> actual = SubstringWithConcatenationOfAllWords.findSubstring(inputS, inputWords);
    Assertions.assertEquals(expected, actual);
  }
}
