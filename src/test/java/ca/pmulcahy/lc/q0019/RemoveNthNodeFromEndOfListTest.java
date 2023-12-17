package ca.pmulcahy.lc.q0019;


import ca.pmulcahy.lc.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfListTest {

  @Test
  public void example1Test() {
    final ListNode input = ListNode.of(1, 2, 3, 4, 5);
    final int inputN = 2;
    final ListNode expected = ListNode.of(1, 2, 3, 5);
    final ListNode actual = RemoveNthNodeFromEndOfList.removeNthFromEnd(input, inputN);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final ListNode input = ListNode.of(1);
    final int inputN = 1;
    final ListNode expected = null;
    final ListNode actual = RemoveNthNodeFromEndOfList.removeNthFromEnd(input, inputN);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final ListNode input = ListNode.of(1, 2);
    final int inputN = 1;
    final ListNode expected = ListNode.of(1);
    final ListNode actual = RemoveNthNodeFromEndOfList.removeNthFromEnd(input, inputN);
    Assertions.assertEquals(expected, actual);
  }
}
