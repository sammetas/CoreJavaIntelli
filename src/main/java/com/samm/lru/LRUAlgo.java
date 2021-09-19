package com.samm.lru;

public class LRUAlgo {
    Node head;
    Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node addNode(Data data){
       if(head==null){
           head=new Node(data);
           tail=head;
           tail.prev=head;
           return head;

       }

      Node current=new Node(data);
       tail.next=current;
       current.prev=tail;
       tail=current;

       return head;

   }

   public void iterateNodes(Node node){

       if (node==null) {
           return;
       }
           System.out.println(node.data.getNo() + "-" + node.data.getName()+ "-" + node.data.getSal());

           iterateNodes(node.next);
       }



    public void iterateNodesReverse(Node node){

        if (node==null) {
            return;
        }
        System.out.println(node.data.getNo() + "-" + node.data.getName()+  "-" + node.data.getSal());

        iterateNodesReverse(node.prev);
    }



}


