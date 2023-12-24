package ca.pmulcahy.lc.q0029;

/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.


 */
public class DivideTwoIntegers {
  public static int divide(int dividend, int divisor) {
    boolean positive = ((dividend < 0 && divisor < 0) || (dividend >= 0 && divisor > 0));

    long longDividend = Math.abs((long) dividend);
    long longDivisor = Math.abs((long) divisor);

    long remainder = 0;
    long result = 0;

    for (int bitCounter = 32; bitCounter >= 0; bitCounter--) {
      long subtractCount = 0;
      long dividendBit = (longDividend >> bitCounter) & 1;
      long partDividend = dividendBit + remainder;
      while (partDividend - longDivisor >= 0) {
        partDividend = partDividend - longDivisor;
        subtractCount++;
      }
      remainder = partDividend << 1;
      result = result | (subtractCount << bitCounter);
    }

    if (!positive) {
      result = result * -1;
    }
    if (result > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }
    return (int) result;
  }
}
