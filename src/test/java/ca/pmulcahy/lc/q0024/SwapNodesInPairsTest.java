package ca.pmulcahy.lc.q0024;

import ca.pmulcahy.lc.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {

  @Test
  public void example1Test() {
    final ListNode input = ListNode.of(1, 2, 3, 4);
    final ListNode expected = ListNode.of(2, 1, 4, 3);
    final ListNode actual = SwapNodesInPairs.swapPairs(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final ListNode input = null;
    final ListNode expected = null;
    final ListNode actual = SwapNodesInPairs.swapPairs(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    final ListNode input = ListNode.of(1);
    final ListNode expected = ListNode.of(1);
    final ListNode actual = SwapNodesInPairs.swapPairs(input);
    Assertions.assertEquals(expected, actual);
  }
}
