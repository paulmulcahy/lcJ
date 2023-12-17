package ca.pmulcahy.lc.q0025;

import ca.pmulcahy.lc.ListNode;

/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.


 */
public class ReverseNodesInKGroup {
  public static ListNode reverseKGroup(ListNode head, int k) {
    ListNode reverseDummyHead = new ListNode();
    ListNode reverseCurr = reverseDummyHead;
    ListNode curr = head;
    while (curr != null) {
      ListNode groupCurrHead = curr;
      ListNode reverseGroupTail = new ListNode(curr.val);
      ListNode reverseGroupHead = reverseGroupTail;
      curr = curr.next;

      int counter = 1;

      while (counter < k && curr != null) {
        reverseGroupHead = new ListNode(curr.val, reverseGroupHead);
        curr = curr.next;
        counter++;
      }
      if (counter == k) {
        reverseCurr.next = reverseGroupHead;
        reverseCurr = reverseGroupTail;
      } else {
        reverseCurr.next = groupCurrHead;
      }
    }
    return reverseDummyHead.next;
  }
}
