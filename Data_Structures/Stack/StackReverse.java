import java.util.Stack;

public class StackReverse {
    public static void addAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int val = stack.pop();
        addAtBottom(stack, data);
        stack.push(val);
    }
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        addAtBottom(stack, top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);        
        stack.push(4);        
        stack.push(3);        
        stack.push(2);        
        stack.push(1);
        System.out.println(stack); 
        reverseStack(stack);
        System.out.println(stack);
    }
}
