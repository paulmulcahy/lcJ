package ca.pmulcahy.lc.q0_1000.q0_100.q0_10.q0002;


/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;

    boolean carryOne = false;

    while (l1 != null || l2 != null) {
      int summedDigit = 0;

      if (l1 != null) {
        summedDigit += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        summedDigit += l2.val;
        l2 = l2.next;
      }

      if (carryOne) {
        summedDigit++;
      }

      curr.next = new ListNode(summedDigit % 10);
      curr = curr.next;

      carryOne = summedDigit > 9;
    }
    if (carryOne) {
      curr.next = new ListNode(1);
    }

    return dummyHead.next;
  }
}
