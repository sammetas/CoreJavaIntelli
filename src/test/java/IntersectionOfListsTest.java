import com.howtocrack.coding.interview.IntersectionOfLists;
import com.howtocrack.coding.interview.ListNode1;
import org.junit.Test;

public class IntersectionOfListsTest {
    //Comment to commit
    @Test
    public void testIntersection(){
        ListNode1Insert l1 = new ListNode1Insert();
        ListNode1Insert l2 = new ListNode1Insert();
        l1.insert(3);l1.insert(1);l1.insert(5);
        ListNode1 h1 =  l1.insert(9);
        l2.insert(4);
        ListNode1 h2 = l2.insert(6);
        ListNode1 l3 = new ListNode1(7);
        l3.next = new ListNode1(2);
        l3.next.next = new ListNode1(1);
        ListNode1 h11 = h1;
        while (h11.next != null){
            // System.out.println(h11.val);
            h11 = h11.next;
        }
        h11.next = l3;
        ListNode1 h22 = h2;
        while (h22.next != null){
            // System.out.println(h22.val);
            h22 = h22.next;
        }
        h22.next = l3;
       /* while (h1 != null){
             System.out.println(h1.val);
            h1 = h1.next;
        }*/
        /*while (h2 != null){
            System.out.println(h2.val);
            h2 = h2.next;
        }*/

        IntersectionOfLists intersectionOfLists = new IntersectionOfLists();
        ListNode1 kthNode =  intersectionOfLists.intersectionNode(h1,h2);
        System.out.println(kthNode.val);
    }
}
