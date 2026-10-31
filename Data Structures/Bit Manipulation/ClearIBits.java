public class ClearIBits {
    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
    }

    public static int clearIBits(int n, int i){
        int bitMask = (-1)<<i;
        return n&bitMask;
    }
}
