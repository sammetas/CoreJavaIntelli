package com.howtocrack.coding.interview;

import java.util.HashMap;
import java.util.Hashtable;

public class LoopDetectionList {
    public ListNode1 getLoopList(ListNode1 head){
        ListNode1 node1 = head;
        Hashtable hashtable = new Hashtable();

        while (node1 != null){
            if(hashtable.containsKey(node1)){
                return node1;
            }
            hashtable.put(node1,"1");
            node1 = node1.next;
        }
        return null;
    }

    // approach two
    public ListNode1 getLoopListV2(ListNode1 head){
        ListNode1 l1 = head;
        ListNode1 l2 = head;
        while (l2 != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next.next;

            if(l1 == l2) break;

        }

        if(l2 == null || l2.next == null) return  null;

        System.out.println(l2.val);
        l1 = head;
        while ( l1 != l2 ){
            l1 = l1.next;
            l2 = l2.next;
        }
        return l2;
    }
}
