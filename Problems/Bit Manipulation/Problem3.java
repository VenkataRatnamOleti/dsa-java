package Problems;

public class Problem3 {
    public static void main(String[] args) {
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch|' ')+" ");
        }
        System.out.println();
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println((int)' ');
    }
}
