package Queue;

import java.util.Stack;

public class TwoStackQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    TwoStackQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int data){
        s1.push(data);
    }

    public int dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public int size(){
        return s1.size() + s2.size();
    }
}
