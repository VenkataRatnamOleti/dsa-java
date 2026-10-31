public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateIthBit(15, 1, 0));
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            int BitMask = ~(1<<i);
            return n&BitMask;
        }else{
            int BitMask = 1<<i;
            return n|BitMask;
        }

        // another method

        // n = n&(~(1<<i));              -----> clearing ith bit
        // int bitMask = newBit<<i;      -----> setting bitmask 
        // return n|bitMask;             -----> return oring of n and bitmask
    }
}
