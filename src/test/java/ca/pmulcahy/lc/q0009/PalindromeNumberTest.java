package ca.pmulcahy.lc.q0009;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

  @Test
  public void example1Test() {
    final int input = 121;
    final boolean actual = PalindromeNumber.isPalindrome(input);
    Assertions.assertTrue(actual);
  }

  @Test
  public void example2Test() {
    final int input = -121;
    final boolean actual = PalindromeNumber.isPalindrome(input);
    Assertions.assertFalse(actual);
  }

  @Test
  public void example3Test() {
    final int input = 10;
    final boolean actual = PalindromeNumber.isPalindrome(input);
    Assertions.assertFalse(actual);
  }

  @Test
  public void my1Test() {
    final int input = 2112;
    final boolean actual = PalindromeNumber.isPalindrome(input);
    Assertions.assertTrue(actual);
  }
}
