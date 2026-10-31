import java.util.Stack;

public class StringReverse {
    public static void reverseString(StringBuilder str){
        Stack<Character> stack = new Stack<>();
        while(!str.isEmpty()){
            stack.push(str.charAt(0));
            str.deleteCharAt(0);
        }
        while(!stack.isEmpty()) {
            str.append(stack.pop());
        }
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        System.out.println(str);
        reverseString(str);
        System.out.println(str);
    }
}
