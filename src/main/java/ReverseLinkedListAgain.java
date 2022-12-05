/*
  Input: a : 10->20->30->40
  Output: a: 40->30->20_10
 */
public class ReverseLinkedListAgain {
    public static void main(String[] args) {
        Nodes n1=new Nodes(10);
        n1.next=new Nodes(20);
        n1.next.next=new Nodes(30);
        n1.next.next.next=new Nodes(40);

        n1.printAll(n1);
        Nodes head=reversePrint(n1);
        n1.printAll(head);
    }

    private static Nodes reversePrint(Nodes head) {

        Nodes prev = null;
        Nodes next = null;
        Nodes current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev =  current;
            current = next;
        }
        return  prev;
    }
}
