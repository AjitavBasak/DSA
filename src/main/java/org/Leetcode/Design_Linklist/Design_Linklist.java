package org.Leetcode.Design_Linklist;

import java.util.ArrayList;

public class Design_Linklist {

    ArrayList<Integer> list;
    public Design_Linklist() {
        list = new ArrayList<Integer>();
    }

    public int get(int index) {
        if(index>=list.size())
            return -1;
        return list.get(index);
    }

    public void addAtHead(int val) {
        list.add(0,val);
    }

    public void addAtTail(int val) {
        list.add(val);
    }

    public void addAtIndex(int index, int val) {
        if(index<=list.size())
            list.add(index,val);
    }

    public void deleteAtIndex(int index) {
        if(index<list.size())
            list.remove(index);
    }
    public static void main(String[] args) {
        // [1, 3]
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//        System.out.println(myLinkedList.get(1));              // return 2
//        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//        System.out.println(myLinkedList.get(1));              // return 3

        Design_Linklist myLinkedList = new Design_Linklist();
        myLinkedList.addAtHead(2);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(3);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtTail(5);
        System.out.println(myLinkedList.get(5));              // return 3
        myLinkedList.deleteAtIndex(6);
        myLinkedList.deleteAtIndex(4);
    }
}