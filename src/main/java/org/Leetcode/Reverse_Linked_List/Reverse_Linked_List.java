package org.Leetcode.Reverse_Linked_List;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        //Recurssion
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    //Loop
//    ListNode current = head;
//    ListNode prev = null;
//    ListNode next = null;
//
//        while(current != null){
//        next = current.next;
//        current.next = prev;
//        prev = current;
//        current = next;
//    }
//    return prev;
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
