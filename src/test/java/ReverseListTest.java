import com.howtocrack.coding.interview.ListNode1;
import org.junit.Assert;
import org.junit.Test;

public class ReverseListTest {
    @Test
    public  void reverseIt(){
        {
            com.howtocrack.coding.interview.ListNode1 n1=new ListNode1(10);
            n1.next= new com.howtocrack.coding.interview.ListNode1(20);
            n1.next.next=new ListNode1(30);
            n1.next.next.next=new ListNode1(40);

            n1.printAll(n1);
            ListNode1 head=new com.howtocrack.coding.interview.ReverseList().reverseList(n1);
            n1.printRec(head);
            Assert.assertNotEquals(n1.val,head.val);
        }
    }


}
