import com.howtocrack.coding.interview.ListNode1;
import com.howtocrack.coding.interview.LoopDetectionList;
import org.junit.Assert;
import org.junit.Test;

public class LoopDetectionTest {
    @Test
    public void testLoop(){
        ListNode1 a = new ListNode1(10);
        ListNode1 b = new ListNode1(20);
        ListNode1 c = new ListNode1(30);
        ListNode1 d = new ListNode1(40);
        ListNode1 e = new ListNode1(50);
        a.next = b;b.next=c;
        c.next=d;d.next=e;
        e.next = c;
      ListNode1 actual =   new LoopDetectionList().getLoopList(a);
        Assert.assertEquals(actual.val,c.val);
        //a.printAll(a);
        ListNode1 actualv2 =   new LoopDetectionList().getLoopListV2(a);
        Assert.assertEquals(actualv2,c);
        //no loop test
        e.next = null;
        Assert.assertNull(new LoopDetectionList().getLoopList(a));
        Assert.assertNull(new LoopDetectionList().getLoopListV2(a));
    }
}
