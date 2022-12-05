package com.howtocrack.coding.interview;

public class ListNode1 {
    public int val;
    public ListNode1 next;
    public ListNode1() {}
    public  ListNode1(int val) { this.val = val; }
    public ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }

    public void printAll(ListNode1 n1) {
        while (n1 != null){
            System.out.print(n1.val+"-->");
            n1 = n1.next;
        }
    }

    public void printRec(ListNode1 n1)  {

        if(n1 == null){
            return;
        }
        System.out.print(n1.val+"-->");
        printRec(n1.next);
    }


}
