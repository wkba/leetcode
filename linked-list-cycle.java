///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        // rm edge case
//        if(head == null || head.next == null){
//            return false;
//        }
//
//        ListNode slow = head;
//        ListNode fast = head.next;
//
//        while(fast != null && fast.next != null){
//            if(fast == slow){
//                return true;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return false;
//    }
//}