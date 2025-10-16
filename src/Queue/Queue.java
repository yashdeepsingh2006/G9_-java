package Queue;

public class Queue {
    Node front = null;
    Node rear = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(front == null){
            return -1;
        }
        int data = front.data;
        front = front.next;
        return data;
    }

    public int peek(){
        if(front == null){
            return -1;
        }
        return front.data;
    }

    public int size(){
        if(front == null){
            return 0;
        }
        int count = 0;
        Node temp = front;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return front == null;
    }
}
