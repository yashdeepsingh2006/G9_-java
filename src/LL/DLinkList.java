package LL;

public class DLinkList {
    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        tail = newNode;
    }

    void prepend(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    static void printForward(Node head){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
    }

    static void printBackward(Node tail){
        if(tail == null){
            System.out.println("null");
            return;
        }

        Node temp = tail;
        while(temp.prev != null){
            System.out.print(temp.data + "-");
            temp = temp.prev;
        }
        System.out.print(temp.data);
    }

    void deleteNode(int key){
        if(head == null){
            System.out.println("nothing to delete");
            return;
        }

        Node temp = head;
        while(temp!=null && temp.data!=key){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Key not found");
            return;

        }

        if(temp == head){
            head = head.next;
        }

        if(temp == tail){
            tail = tail.prev;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }



    public static void main(String[] args) {
        DLinkList list = new DLinkList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.prepend(0);

        printForward(list.head);
        System.out.println();
        printBackward(list.tail);
        System.out.println();

        list.deleteNode(3);
        printForward(list.head);


    }

}
