package ca.pmulcahy.lc.q002;

// Definition for singly-linked list.
public class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
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
}
