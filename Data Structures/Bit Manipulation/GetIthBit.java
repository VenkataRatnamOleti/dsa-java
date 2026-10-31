public class GetIthBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(15, 2));
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) != 0) return 1;
        else return 0;
    }
}
