package ca.pmulcahy.lc.q0008;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ca.pmulcahy.lc.q0007.ReverseInteger;

public class StringToIntegerTest {
	
	  @Test
	  public void example1Test() {
	    final String input = "42";
	    final int expected = 42;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void example2Test() {
	    final String input = "-42";
	    final int expected = -42;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void example3Test() {
	    final String input = "4193 with words";
	    final int expected = 4193;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void lc1Test() {
	    final String input = "words and 987";
	    final int expected = 0;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void lc2Test() {
	    final String input = "+-12";
	    final int expected = 0;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void lc3Test() {
	    final String input = "  0000000000012345678";
	    final int expected = 12345678;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void lc4Test() {
	    final String input = "-5-";
	    final int expected = -5;
	    final int actual = StringToInteger.myAtoi(input);
	    Assertions.assertEquals(expected, actual);
	  }
}
