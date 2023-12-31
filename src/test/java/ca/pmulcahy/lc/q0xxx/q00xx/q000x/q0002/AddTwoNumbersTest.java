package ca.pmulcahy.lc.q0xxx.q00xx.q000x.q0002;

import ca.pmulcahy.lc.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

  @Test
  public void example1Test() {
    ListNode l1 = ListNode.of(2, 4, 3);
    ListNode l2 = ListNode.of(5, 6, 4);

    ListNode expected = ListNode.of(7, 0, 8);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    ListNode l1 = ListNode.of(0);
    ListNode l2 = ListNode.of(0);

    ListNode expected = ListNode.of(0);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    ListNode l1 = ListNode.of(9, 9, 9, 9, 9, 9, 9);
    ListNode l2 = ListNode.of(9, 9, 9, 9);

    ListNode expected = ListNode.of(8, 9, 9, 9, 0, 0, 0, 1);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    ListNode l1 = ListNode.of(5, 6);
    ListNode l2 = ListNode.of(5, 4, 9);

    ListNode expected = ListNode.of(0, 1, 0, 1);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    ListNode l1 = ListNode.of(9, 9, 9, 9, 9, 9, 9, 9, 9);
    ListNode l2 = ListNode.of(0);

    ListNode expected = ListNode.of(9, 9, 9, 9, 9, 9, 9, 9, 9);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }
}
