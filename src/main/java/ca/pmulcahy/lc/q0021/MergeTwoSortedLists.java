package ca.pmulcahy.lc.q0021;

import ca.pmulcahy.lc.ListNode;

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyMergedHead = new ListNode();

    ListNode currNode = dummyMergedHead;

    while (list1 != null || list2 != null) {
      if (list1 != null) {
        if (list2 != null) {
          if (list1.val < list2.val) {
            currNode.next = new ListNode(list1.val);
            list1 = list1.next;
          } else {
            currNode.next = new ListNode(list2.val);
            list2 = list2.next;
          }
        } else {
          currNode.next = new ListNode(list1.val);
          list1 = list1.next;
        }
      } else {
        currNode.next = new ListNode(list2.val);
        list2 = list2.next;
      }
      currNode = currNode.next;
    }
    return dummyMergedHead.next;
  }
}
