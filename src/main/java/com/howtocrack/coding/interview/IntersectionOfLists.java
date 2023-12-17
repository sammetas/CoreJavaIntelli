package com.howtocrack.coding.interview;
/*
  L1:1->2->3-4>5->
                       10->11->12
  L2:     7 - 8 - 9 ->
  so it has to return Node 10 from where the common node started.
 */
public class IntersectionOfLists {
    ListNode1 head = null;
    public ListNode1 intersectionNode(ListNode1 l1 , ListNode1 l2){

        ListNode1  l11 = l1;
        ListNode1 l22 = l2;

        ResultNode r1 = getSize(l1);
        ResultNode r2 = getSize(l2);
        if(r1.node.val != r2.node.val) return null; // no intersection
        ListNode1 longList =null;
        ListNode1 shortList =null;
        if(r1.size>r2.size){
             longList =l1;
             shortList =l2;
        }else {
              longList = l2;
              shortList = l1;
        }
        int diff = Math.abs(r1.size-r2.size);

        ListNode1 kthNode = getKthNode(diff,longList);
        while (shortList != kthNode){
            shortList = shortList.next;
            kthNode = kthNode.next;
        }
        return shortList; //or kthNode;
    }

    private ListNode1 getKthNode(int diff, ListNode1 longList) {
        ListNode1 tmp = longList;
        while (diff > 0 && tmp != null){
            tmp = tmp.next;
            diff--;
        }
        return tmp;
    }


    private static class ResultNode{
   ListNode1 node;
   int size;
   public  ResultNode(ListNode1 node, int size){ this.node = node; this.size = size;}
}
private  ResultNode getSize(ListNode1 node1){
         ListNode1 listNode1 = node1;
         int i=0;
         while (listNode1.next != null){
             listNode1 = listNode1.next;
             i++;
         }
         return new ResultNode(listNode1,i);
}

}
