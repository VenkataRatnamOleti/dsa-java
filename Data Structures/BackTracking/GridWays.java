public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1 || j==m-1){  //condn for last cell
            return 1;
        } else if(i == n || j == m){  //boundary cross condn
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }

    // Short Trick
    public static int countWays(int n, int m){
        return fact(n+m-2)/(fact(n-1)*fact(m-1));
    }

    public static int fact(int n){
        if(n == 1) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n=5,m=5;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(countWays(n, m));
    }
}
