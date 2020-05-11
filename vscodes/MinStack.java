import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MinStack {

    // 数据栈
    private Stack<Integer> data;
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
    }
    
    public void push(int x) {
        data.add(x);

    }
    
    public void pop() {
        if(!data.isEmpty()) {
            data.pop();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");

    }
    
    public int top() {
        if(!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");

    }
    
    public int getMin() {
        if(!data.isEmpty()) {
            return Collections.min(data);
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
        
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