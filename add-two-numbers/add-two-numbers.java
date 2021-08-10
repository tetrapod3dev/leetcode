/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode point1 = l1;
    ListNode point2 = l2;
    ListNode result = new ListNode();
    ListNode pointL = result;
    while (point1 != null || point2 != null) {
      int temp = 0;
      if (point1 != null) {
        temp += point1.val;
      }
      if (point2 != null) {
        temp += point2.val;
      }
      temp += pointL.val;
      pointL.val = temp % 10;
      if (temp > 9) {
        pointL.next = new ListNode((temp / 10) % 10);
      }
      if (point1 != null) {
        point1 = point1.next;
      }
      if (point2 != null) {
        point2 = point2.next;
      }
      if (point1 == null && point2 == null) {
        break;
      }
      if (pointL.next == null) {
        pointL.next = new ListNode();
      }
      pointL = pointL.next;
    }
    return result;
  }
}