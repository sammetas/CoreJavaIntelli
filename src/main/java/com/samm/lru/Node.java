package com.samm.lru;

public class Node{
    Data data;
    Node prev;
    Node next;

    public Node(Data data){
        this.data=data;
        prev=next=null;

    }
}
