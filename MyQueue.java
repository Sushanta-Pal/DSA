import java.util.Stack;

class MyQueue {
    Stack<Integer> enq;
    Stack<Integer> deq;
    public MyQueue() {
        enq =new Stack<>(); 
        deq =new Stack<>(); 
    }
    
    public void push(int x) {
        this.enq.push(x);
    }
    
    public int pop() {
        while (!this.enq.isEmpty()) {
        this.deq.push(this.enq.pop());
        }
        int val= this.deq.pop();
        while (!this.deq.isEmpty()) {
            this.enq.push(this.deq.pop());
            }
            return val;
    }
    
    public int peek() {
        while (!this.enq.isEmpty()) {
            this.deq.push(this.enq.pop());
            }
            int val= this.deq.peek();
            while (!this.deq.isEmpty()) {
                this.enq.push(this.deq.pop());
                }
                return val;
    }
    
    public boolean empty() {
        return this.enq.isEmpty();
    }
    public static void main(String[] args) {
        
    }
}
