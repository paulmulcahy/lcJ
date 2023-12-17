package ca.pmulcahy.lc.q0021;

import ca.pmulcahy.lc.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

  @Test
  public void example1Test() {
    final ListNode input1 = ListNode.of(1, 2, 4);
    final ListNode input2 = ListNode.of(1, 3, 4);
    final ListNode expected = ListNode.of(1, 1, 2, 3, 4, 4);
    final ListNode actual = MergeTwoSortedLists.mergeTwoLists(input1, input2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final ListNode input1 = null;
    final ListNode input2 = null;
    final ListNode expected = null;
    final ListNode actual = MergeTwoSortedLists.mergeTwoLists(input1, input2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final ListNode input1 = null;
    final ListNode input2 = ListNode.of(0);
    final ListNode expected = ListNode.of(0);
    final ListNode actual = MergeTwoSortedLists.mergeTwoLists(input1, input2);
    Assertions.assertEquals(expected, actual);
  }
}
