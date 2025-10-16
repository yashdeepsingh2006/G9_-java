package LL;

public class LinkList {
    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void addNode(int key){
        Node newnode = new Node(key);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public static void printList(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(head != null){
            System.out.print(head.data + "-");
            head = head.next;
        }
    }

    public void reversePrint(Node head){
        if(head == null){
            return;
        }
        reversePrint(head.next);
        System.out.print(head.data+"-");
    }

    public void deleteNode(int key){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = this.head;
        Node prev = null;

        if(temp.data == key){
            this.head = head.next;
            return;
        }

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Key not found");
            return;
        }
        prev.next = temp.next;

    }

    public static Node copyList(Node list){
        if(list == null){
            System.out.println("List is empty");
            return null;
        }

        Node newHead = new Node(list.data);
        Node temp = newHead;
        list = list.next;

        while(list != null){
            temp.next = new Node(list.data);
            temp = temp.next;
            list = list.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addNode(1);
        linkList.addNode(2);
        linkList.addNode(3);
        linkList.addNode(4);
        linkList.addNode(5);


        System.out.println("copied list");
        Node copy = copyList(linkList.head);
        printList(copy);


    }
}
