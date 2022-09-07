package org.Leetcode.Add_Two_Numbers;
import java.lang.Math.*;
public class Add_Two_Numbers {
    public ListNode resList = new ListNode(0);
    public ListNode head = resList;
    public int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        resList.next = new ListNode(sum % 10);
        resList = resList.next;
        if (l1.next != null && l2.next != null)
            addTwoNumbers(l1.next, l2.next);
        else if (l1.next != null)
            addTwoNumbers(l1.next, new ListNode(0));
        else if (l2.next != null)
            addTwoNumbers(new ListNode(0), l2.next);
        else if (carry > 0) {
            resList.next = new ListNode(1);
            resList = resList.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        //TODO create list node
       // System.out.println(new Add_Two_Numbers().addTwoNumbers(l1,l2));
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}




