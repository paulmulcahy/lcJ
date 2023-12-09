package ca.pmulcahy.lc.q0002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

  private ListNode intArrayToListNode(int... intArr) {
    if (intArr.length == 0) {
      return null;
    }
    ListNode toReturn = new ListNode(intArr[intArr.length - 1]);
    for (int i = intArr.length - 2; i >= 0; i--) {
      toReturn = new ListNode(intArr[i], toReturn);
    }
    return toReturn;
  }

  @Test
  public void example1Test() {
    ListNode l1 = intArrayToListNode(2, 4, 3);
    ListNode l2 = intArrayToListNode(5, 6, 4);

    ListNode expected = intArrayToListNode(7, 0, 8);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    ListNode l1 = intArrayToListNode(0);
    ListNode l2 = intArrayToListNode(0);

    ListNode expected = intArrayToListNode(0);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    ListNode l1 = intArrayToListNode(9, 9, 9, 9, 9, 9, 9);
    ListNode l2 = intArrayToListNode(9, 9, 9, 9);

    ListNode expected = intArrayToListNode(8, 9, 9, 9, 0, 0, 0, 1);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    ListNode l1 = intArrayToListNode(5, 6);
    ListNode l2 = intArrayToListNode(5, 4, 9);

    ListNode expected = intArrayToListNode(0, 1, 0, 1);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc2Test() {
    ListNode l1 = intArrayToListNode(9, 9, 9, 9, 9, 9, 9, 9, 9);
    ListNode l2 = intArrayToListNode(0);

    ListNode expected = intArrayToListNode(9, 9, 9, 9, 9, 9, 9, 9, 9);
    ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    Assertions.assertEquals(expected, actual);
  }
}
