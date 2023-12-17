package ca.pmulcahy.lc.q0025;

import ca.pmulcahy.lc.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseNodesInKGroupTest {

  @Test
  public void example1Test() {
    final ListNode input = ListNode.of(1, 2, 3, 4, 5);
    final int inputK = 2;
    final ListNode expected = ListNode.of(2, 1, 4, 3, 5);
    final ListNode actual = ReverseNodesInKGroup.reverseKGroup(input, inputK);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    final ListNode input = ListNode.of(1, 2, 3, 4, 5);
    final int inputK = 3;
    final ListNode expected = ListNode.of(3, 2, 1, 4, 5);
    final ListNode actual = ReverseNodesInKGroup.reverseKGroup(input, inputK);
    Assertions.assertEquals(expected, actual);
  }
}
