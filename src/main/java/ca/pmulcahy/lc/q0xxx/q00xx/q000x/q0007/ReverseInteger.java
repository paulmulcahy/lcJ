package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0007;

public class ReverseInteger {
  private static String INT_MAX_VALUE_STRING = Integer.toString(Integer.MAX_VALUE);
  private static String INT_MIN_VALUE_STRING_WITHOUT_NEGATIVE =
      Integer.toString(Integer.MIN_VALUE).substring(1);

  // TODO reimplement without using Strings
  public static int reverse(int x) {
    String strInput = Integer.toString(x);
    boolean negative = '-' == strInput.charAt(0);
    if (negative) {
      strInput = strInput.substring(1);
    }
    String reversed = new StringBuilder(strInput).reverse().toString();
    if (negative) {
      if (reversed.length() == INT_MIN_VALUE_STRING_WITHOUT_NEGATIVE.length()
          && reversed.compareTo(INT_MIN_VALUE_STRING_WITHOUT_NEGATIVE) > 0) {
        return 0;
      }
      reversed = "-" + reversed;
    } else if (reversed.length() == INT_MAX_VALUE_STRING.length()
        && reversed.compareTo(INT_MAX_VALUE_STRING) > 0) {
      return 0;
    }
    return Integer.valueOf(reversed);
  }
}
