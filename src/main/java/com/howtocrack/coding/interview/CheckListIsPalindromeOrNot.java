package com.howtocrack.coding.interview;

public class CheckListIsPalindromeOrNot {
    private static boolean isPalindrome(ListNode head){
        StringBuffer sb = new StringBuffer();

        while(head!=null){
            sb.append(head.val);
            head = head.next;
        }

        return sb.toString().equals(sb.reverse().toString());

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


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
