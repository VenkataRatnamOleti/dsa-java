public class Problem1 {

    public static int findSevens(int matrix[][]){
        int sevens = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 7){
                    sevens++;
                }
            }
        }

        return sevens;
    }


    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};

        System.out.println(findSevens(matrix));
    }
}
