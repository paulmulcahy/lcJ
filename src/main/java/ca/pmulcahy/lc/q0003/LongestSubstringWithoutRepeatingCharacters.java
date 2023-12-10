package ca.pmulcahy.lc.q0003;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters {
  public static int lengthOfLongestSubstring(String s) {
    int longestSubstringLength = 0;
    int currentSubstringLength = 0;

    Deque<Character> usedCharsDeque = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char character = s.charAt(i);
      if (usedCharsDeque.contains(character)) {
        if (currentSubstringLength > longestSubstringLength) {
          longestSubstringLength = currentSubstringLength;
        }
        char removedCharacter;
        do {
          removedCharacter = usedCharsDeque.removeFirst();
          currentSubstringLength--;
        } while (removedCharacter != character);
      }
      usedCharsDeque.addLast(character);
      currentSubstringLength++;
    }

    if (currentSubstringLength > longestSubstringLength) {
      longestSubstringLength = currentSubstringLength;
    }

    return longestSubstringLength;
  }
}
