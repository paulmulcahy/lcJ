package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0023;

import ca.pmulcahy.lc.ListNode;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
 */
public class MergeKSortedLists {
  public static ListNode mergeKLists(ListNode[] lists) {
    ListNode dummyHead = new ListNode();
    ListNode tail = dummyHead;
    while (isNotEmpty(lists)) {
      int firstNonNullIndex = getFirstNonNullIndex(lists);
      int lowestVal = lists[firstNonNullIndex].val;
      int lowestIndex = firstNonNullIndex;
      for (int i = firstNonNullIndex + 1; i < lists.length; i++) {
        if (lists[i] != null && lists[i].val < lowestVal) {
          lowestVal = lists[i].val;
          lowestIndex = i;
        }
      }
      tail.next = lists[lowestIndex];
      tail = tail.next;
      lists[lowestIndex] = lists[lowestIndex].next;
      tail.next = null;
    }
    return dummyHead.next;
  }

  private static boolean isNotEmpty(ListNode[] lists) {
    for (ListNode listNode : lists) {
      if (listNode != null) {
        return true;
      }
    }
    return false;
  }

  private static int getFirstNonNullIndex(ListNode[] lists) {
    for (int i = 0; i < lists.length; i++) {
      ListNode listNode = lists[i];
      if (listNode != null) {
        return i;
      }
    }
    throw new RuntimeException();
  }
}
