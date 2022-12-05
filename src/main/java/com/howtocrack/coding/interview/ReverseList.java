package com.howtocrack.coding.interview;
/*
  Input: 1->2->3->4->5
  Output: 5->4->3->2->1
 */
public class ReverseList {
    public ListNode1 reverseList(ListNode1 root){
        System.out.println();
        ListNode1 prev = null;
        ListNode1 next = null;
        ListNode1 current = root;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
