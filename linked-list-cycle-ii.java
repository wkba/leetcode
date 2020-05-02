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
//    public ListNode detectCycle(ListNode head) {
//        // rm edge case
//        if(head == null || head.next == null){ return null;}
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        // find pointA
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if(fast == slow){
//                ListNode slow2 = head;
//                while(slow != slow2){
//                    // move same speed.
//                    slow = slow.next;
//                    slow2 = slow2.next;
//                }
//
//                return slow;
//            }
//
//        }
//        return null;
//    }
//}
