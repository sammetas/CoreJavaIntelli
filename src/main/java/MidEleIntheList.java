public class MidEleIntheList {
    public static void main(String[] args) {
        ListNode2 l1 = new ListNode2(1);
        ListNode2 l2 = new ListNode2(2);
        ListNode2 l3 = new ListNode2(3);
        ListNode2 l4 = new ListNode2(4);
        ListNode2 l5 = new ListNode2(5);
        ListNode2 l6 = new ListNode2(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;

        System.out.println(returnMidValue(l1));
        System.out.println(returnMidValue1(l1));


    }

    private static int returnMidValue1(ListNode2 l1) {
        int c =0;
        ListNode2 l3 = l1;
        while (l1 != null){
            c++;l1 = l1.next;
        }
         for(int i=0; i < c/2; i++){
             l3 = l3.next;
         }
         return l3.val;
    }

    private static int returnMidValue(ListNode2 l1) {

        ListNode2 slow = l1;
        ListNode2 speed = l1.next;
        while (speed != null){
            slow = slow.next;
            if(speed.next == null) return slow.val;
            speed = speed.next.next;
        }

        return slow.val;
    }
}
