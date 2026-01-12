public class FastExpo {
    public static void main(String[] args) {
        System.out.println(fastExponent(9,3));
    }

    public static int fastExponent(int b, int e){
        int ans = 1;
        while(e!=0){
            if((e&1)!= 0) ans*=b;
            b = b * b;
            e = e>>1;
        }
        return ans;
    }
}
