

public class ReverseList {



    private static void reverseList(ListNode2 l1) {


        ListNode2 prev = null;
        while (l1 != null){
         ListNode2 temp = l1.next;
         l1.next = prev;
         prev = l1;
         l1 = temp;

        }

        while (prev != null){
            System.out.println(prev.val);
            prev = prev.next;
        }

    }
    public static void main(String[] args) {
        ListNode2 l1 = new  ListNode2(1);
        ListNode2 l2 = new  ListNode2(2);
        ListNode2 l3 = new  ListNode2(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        reverseList(l1);


    }
}


class ListNode2 {
    int val;
     ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }

}
