package ca.pmulcahy.lc.q0020;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
  public static boolean isValid(String s) {
    Deque<Character> deque = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
        case '(':
          deque.addFirst('(');
          break;
        case ')':
          if (deque.isEmpty() || deque.peekFirst() != '(') {
            return false;
          }
          deque.removeFirst();
          break;
        case '[':
          deque.addFirst('[');
          break;
        case ']':
          if (deque.isEmpty() || deque.peekFirst() != '[') {
            return false;
          }
          deque.removeFirst();
          break;
        case '{':
          deque.addFirst('{');
          break;
        case '}':
          if (deque.isEmpty() || deque.peekFirst() != '{') {
            return false;
          }
          deque.removeFirst();
          break;
      }
    }
    return deque.isEmpty();
  }
}
