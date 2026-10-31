public class Sudoku {

    public static boolean isSafe(int[][] board, int i, int j, int k){
        for (int a = 0; a < board.length; a++) {
            if(board[i][a] == k) return false;
        }
        for (int a = 0; a < board.length; a++) {
            if(board[a][j] == k) return false;
        }
        int si = (i/3)*3;
        int sj = (j/3)*3;
        for (int a = si; a < si+3; a++) {
            for (int b = sj; b < sj+3; b++) {
                if(board[a][b] == k) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] board =  {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        
        if(sudokuSolver(board, 0, 0)){
            System.out.println("Solution Exist!");
            printSudoku(board);
        }else{
            System.out.println("Solution not Exists!");
        }
    }

    public static void printSudoku(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean sudokuSolver(int[][] board, int row, int col){
        
        if(row == 9){
            return true;
        }

        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow++;
            nextCol = 0;
        }

        if(board[row][col] != 0){
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (int k = 1; k < 10; k++) {
            if(isSafe(board,row,col,k)){
                board[row][col] = k;
                if(sudokuSolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = 0;
            }
        }

        return false;
    }
}
