package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0009;

// Given an integer x, return true if x is a palindrome, and false otherwise.
public class PalindromeNumber {

  // TODO: do it without strings
  public static boolean isPalindrome(int x) {
    String num = Integer.toString(x);

    for (int i = 0; i < num.length() / 2; i++) {
      if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
        return false;
      }
    }

    return true;
  }
}
