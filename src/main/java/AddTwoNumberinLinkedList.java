import java.math.BigDecimal;
import java.math.BigInteger;

public class AddTwoNumberinLinkedList {

    public static void main(String[] args) {


          BigDecimal one = new BigDecimal("803");
        BigDecimal two = new BigDecimal("91");

        BigDecimal b1 = one.remainder(BigDecimal.valueOf(10));
        System.out.println(one.add(two).toString());
        System.out.println(b1);
        System.out.println(one.movePointLeft(1));

        for(int i=0;i<one.toString().length();i++){
            System.out.println(one.toString().charAt(i));
        }


    }


       public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            if(l1.val==0 && l2.val==0) return new ListNode(0);
            int l1Sum = 0;
            int l2Sum = 0;
            int i=1;
            while(l1 !=null){
                l1Sum += l1.val*i;
                i *= 10;
                l1=l1.next;
            }
            int j=1;
            while(l2 !=null){
                l2Sum += l2.val*j;
                j *= 10;
                l2 = l2.next;
            }

            int sum = l1Sum + l2Sum;
            ListNode result = new ListNode();

            while(sum > 0){
                int t= sum %10 ;
                ListNode temp = new ListNode(t);
                result.next = temp;
                result = temp;
                sum = sum /10;

            }
            return result;
        }
    }


 class ListNode {
        int val;
        ListNode next;
         ListNode() {}
           ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
