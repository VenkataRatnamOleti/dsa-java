public class ClearIRangeBits {
    public static void main(String[] args) {
        System.out.println(clearIRangeBits(31, 3,1));
    }

    public static int clearIRangeBits(int n, int start, int stop){
        int a = (-1)<<(start+1);
        int b = (1<<stop)-1;

        return n&(a|b);
    }
}
