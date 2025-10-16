package Stack;

public class Stack {
    Node top;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        if(top == null){
            return 0;
        }
        int count = 0;
        Node temp = top;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }

        return count;
    }
}
