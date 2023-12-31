package ca.pmulcahy.lc.q0xxx.q00xx.q001x.q0019;

import ca.pmulcahy.lc.ListNode;

public class RemoveNthNodeFromEndOfList {

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    int nodeCounter = 0;
    ListNode nextNode = head;
    while (nextNode != null) {
      nodeCounter++;
      nextNode = nextNode.next;
    }

    int nodeToRemove = nodeCounter - n;
    if (nodeToRemove == 0) {
      head = head.next;
    } else {
      nextNode = head;
      for (int i = 0; i < nodeToRemove - 1; i++) {
        nextNode = nextNode.next;
      }
      nextNode.next = nextNode.next.next;
    }

    return head;
  }
}
