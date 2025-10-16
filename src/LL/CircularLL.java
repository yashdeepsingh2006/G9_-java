package LL;

public class CircularLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    static void printList(Node head){

    }
}
