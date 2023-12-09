package ca.pmulcahy.lc.q002;

import java.util.ArrayDeque;
import java.util.Deque;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    final Deque<Integer> queue = new ArrayDeque<>();
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

      queue.add(summedDigit % 10);

      carryOne = summedDigit > 9;
    }

    if (carryOne) {
      queue.add(1);
    }

    ListNode sum = null;
    while (!queue.isEmpty()) {
      sum = new ListNode(queue.pollLast(), sum);
    }

    return sum;
  }
}
