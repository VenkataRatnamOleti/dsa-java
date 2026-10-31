import java.util.Stack;

public class pushAtBottomOfStack {
    public static void addAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int val = stack.pop();
        addAtBottom(stack, data);
        stack.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);        
        stack.push(2);        
        stack.push(1);
        System.out.println(stack); // [3, 2, 1]
        addAtBottom(stack, 4);
        System.out.println(stack); // [4, 3, 2, 1]
    }
}
