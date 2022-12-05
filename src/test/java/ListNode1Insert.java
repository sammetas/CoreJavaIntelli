import com.howtocrack.coding.interview.ListNode1;

public class ListNode1Insert {
  ListNode1 head ;

    public ListNode1 insert(int data){

        ListNode1 newNode = new ListNode1(data);
        if(this.head == null){
            head = newNode;
        }else {
            ListNode1 currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return head;
    }
}
