public class SetBitsCount {
    public static void main(String[] args) {
        System.out.println(countBits(128));
    }

    public static int countBits(int n){
        int count = 0;
        while(n!=0){
            count += n&1;
            n = n>>1;
        }
        return count;
    }
}
