package ca.pmulcahy.lc.q0030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
You are given a string s and an array of strings words. All the strings of words are of the same length.
A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings.
"acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.
Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
 */
public class SubstringWithConcatenationOfAllWords {
  public static List<Integer> findSubstring(String s, String[] words) {
    List<Integer> toReturn = new ArrayList<>();

    if (s.isEmpty() || words.length == 0) {
      return Collections.emptyList();
    }

    final int wordLength;
    final int numWords;
    final Map<String, Long> numEachWord;
    if (Arrays.stream(words).distinct().count() == 1) {
      String newWord = Arrays.stream(words).collect(Collectors.joining());
      numEachWord = Map.of(newWord, 1L);
      wordLength = words[0].length() * words.length;
      numWords = 1;
    } else {
      numEachWord =
          Arrays.stream(words)
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      wordLength = words[0].length();
      numWords = words.length;
    }

    for (int numPrependingChars = 0;
        numPrependingChars <= s.length() - numWords * wordLength;
        numPrependingChars++) {
      Map<String, Integer> numEachWordInString = new HashMap<>();
      int wordCount = 0;
      for (; wordCount < numWords; wordCount++) {
        final String wordInString =
            s.substring(
                numPrependingChars + wordCount * wordLength,
                numPrependingChars + wordCount * wordLength + wordLength);
        numEachWordInString.merge(wordInString, 1, Integer::sum);
        if (numEachWordInString.get(wordInString) > numEachWord.getOrDefault(wordInString, 0L)) {
          break;
        }
      }
      if (wordCount == numWords) {
        toReturn.add(numPrependingChars);
      }
    }
    return toReturn;
  }
}
