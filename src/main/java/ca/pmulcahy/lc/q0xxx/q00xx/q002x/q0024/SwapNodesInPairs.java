package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0024;

import ca.pmulcahy.lc.ListNode;

/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 */
public class SwapNodesInPairs {
  public static ListNode swapPairs(ListNode head) {
    if (head != null && head.next != null) {
      ListNode newHead = head.next;
      head.next = newHead.next;
      newHead.next = head;
      head = newHead;

      ListNode beforeFirst = head.next;
      ListNode first = beforeFirst.next;
      while (first != null && first.next != null) {
        ListNode newFirst = first.next;
        first.next = newFirst.next;
        newFirst.next = first;
        beforeFirst.next = newFirst;

        beforeFirst = newFirst.next;
        first = beforeFirst.next;
      }
    }
    return head;
  }
}
