package com.howtocrack.coding.interview;

import java.util.Stack;

public class IsListPalindromeStackApp {
    private static boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();

         ListNode l1  = head;
         ListNode l2 = head;

         while (l2 != null && l2.next != null){
             stack.add(l1.val);
             l1 = l1.next;
             l2 = l2.next.next;
         }

         l1 = l1.next;

         while (l1 != null){
             if(l1.val != stack.peek()) return false;
             l1 = l1.next;
         }
         return true;




    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
                l1.next = l2;
                l2.next = l3;
                l3.next = null;
        System.out.println(isPalindrome(l1));

    }
}


/*class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/
