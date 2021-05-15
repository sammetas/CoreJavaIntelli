import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Nodes n1=new Nodes(10);
        n1.next=new Nodes(20);
        n1.next.next=new Nodes(30);
        n1.next.next.next=new Nodes(40);

        n1.printAll(n1);
        Nodes head=n1.reversePrint(n1);
        n1.printAll(head);


    }
}





class Nodes{
    int data;
    Nodes next;

    public Nodes(int data) {
        this.data = data;
        next=null;
    }

    public void printAll(Nodes root){

        while(root!=null){
            System.out.print(root.data+"-->");
        root=root.next;
        }
        System.out.println();
    }
// 10->20->30->40
// 10
    public Nodes reversePrint(Nodes head) {
        Nodes next=null;
        Nodes prev=null;
        Nodes current=head;

        while(current!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        return prev;





    }
}

