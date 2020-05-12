import java.util.Stack;

public class MinStack_155 {
    Stack<Integer> min;
    Stack<Integer> data;
    /** initialize your data structure here. */
    public MinStack_155() {
        min = new Stack();
        data = new Stack();
    }

    public void push(int x) {
        data.push(x);
        if(min.isEmpty() || min.peek().intValue() > x){
            min.push(x);
        }else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if(!data.isEmpty()){
            data.pop();
            min.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */