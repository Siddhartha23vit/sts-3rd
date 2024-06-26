import java.util.*;

public class MinStack2{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int x){
        stack.push(x);
        if(minStack.isEmpty() || x<=minStack.peek()){
            minStack.push(x);
        }

    }

    public void pop(){
        if(!stack.isEmpty()){
            int popped = stack.pop();
            if(popped == minStack.peek()){
                minStack.pop();

            }
        }
    }

    public int top(){
        if(!stack.isEmpty()){
            return stack.peek();

        }throw new RuntimeException("stack empty");
    }

    public int getMin(){
        if(!minStack.isEmpty()){
            return minStack.peek();

        }
        throw new RuntimeException("stack is emtpy");
    }

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        System.out.println(minStack.getMin());
        minStack.top();
    }

}