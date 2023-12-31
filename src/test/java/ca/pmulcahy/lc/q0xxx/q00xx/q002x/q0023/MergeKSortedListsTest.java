package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0023;

import ca.pmulcahy.lc.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeKSortedListsTest {

  @Test
  public void example1Test() {
    final ListNode[] input = {ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)};
    final ListNode expected = ListNode.of(1, 1, 2, 3, 4, 4, 5, 6);
    final ListNode actual = MergeKSortedLists.mergeKLists(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final ListNode[] input = {};
    final ListNode expected = null;
    final ListNode actual = MergeKSortedLists.mergeKLists(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final ListNode[] input = {null};
    final ListNode expected = null;
    final ListNode actual = MergeKSortedLists.mergeKLists(input);
    Assertions.assertEquals(expected, actual);
  }
}
