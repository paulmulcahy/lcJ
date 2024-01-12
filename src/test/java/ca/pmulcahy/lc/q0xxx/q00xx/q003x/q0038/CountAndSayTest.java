package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0038;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {

  @Test
  public void example1Test() {
    int input = 1;
    String expected = "1";
    String actual = CountAndSay.countAndSay(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int input = 4;
    String expected = "1211";
    String actual = CountAndSay.countAndSay(input);
    Assertions.assertEquals(expected, actual);
  }
}
