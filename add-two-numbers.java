///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        // rm edeg case
//
//        ListNode c1 = l1;
//        ListNode c2 = l2;
//        ListNode result = new ListNode(-1);
//        ListNode c3 = result;
//
//        boolean shouldIncrement = false;
//
//        while(true){
//            if(c1 == null &&  c2 == null){
//                break;
//            }
//
//            int val = 0;
//            if(c1 != null) val += c1.val;
//            if(c2 != null) val += c2.val;
//
//            if(shouldIncrement){
//                val++;
//                shouldIncrement = false;
//            }
//
//            c3.next = new ListNode(val%10);
//
//            if(val / 10 > 0){
//                shouldIncrement = true;
//            }
//
//            if(c1 != null) c1 = c1.next;
//            if(c2 != null) c2 = c2.next;
//            c3 = c3.next;
//        }
//
//        if(shouldIncrement){
//            c3.next = new ListNode(1);
//        }
//
//        return result.next;
//    }
//
//}
