package ca.pmulcahy.lc;

// Definition for singly-linked list.
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object other) {
    if (other instanceof ListNode otherNode) {
      if (this.val == otherNode.val) {
        if (this.next == null && otherNode.next == null) {
          return true;
        }
        if ((this.next != null && otherNode.next == null)
            || (this.next == null && otherNode.next != null)) {
          return false;
        }
        return this.next.equals(otherNode.next);
      }
      return false;
    }
    return false;
  }

  @Override
  public String toString() {
    if (next == null) {
      return Integer.toString(val);
    } else {
      return Integer.toString(val) + next.toString();
    }
  }

  public static ListNode of(int... arr) {
    ListNode listNode = new ListNode(arr[arr.length - 1]);
    for (int i = arr.length - 2; i >= 0; i--) {
      listNode = new ListNode(arr[i], listNode);
    }
    return listNode;
  }
}
