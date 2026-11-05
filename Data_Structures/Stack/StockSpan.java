import java.util.Arrays;
import java.util.Stack;
public class StockSpan {
    public static int[] findSpans(int[] stocks){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[stocks.length];
        int n = stocks.length;
        res[0] = 1;
        stack.push(0);
        for(int i=1; i<n; i++){
            while(!stack.isEmpty() && stocks[i] >= stocks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = i+1;
            }else{
                res[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] stocks = {100,80,60,70,60,85,100};
        System.out.println(Arrays.toString(findSpans(stocks)));
    }
}
