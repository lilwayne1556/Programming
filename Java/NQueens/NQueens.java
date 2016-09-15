import java.util.Scanner;
class NQueens {
    public static void main(String[] args){
        int numberOfQueens = 8;
        Scanner obj = new Scanner(System.in);
        System.out.print("How many queens do you want? ");
        numberOfQueens = obj.nextInt();
        int[][] board = new int[numberOfQueens][numberOfQueens]; //Set the chess board, default 8x8
        int[] mem = new int[numberOfQueens]; //Set memory array for column
        solveBoard(board, numberOfQueens, 0, 0, mem, mem ,0);
    }

    public static void solveBoard(int[][] board, int size, int row, int column, int[] memRow, int[] memColumn, int queens){
        int[][] board2 = board;
        if(memColumn[column]==0 && checkDiagonal(board, size, row, column)){
            board[row][column] = 1;
            memColumn[column] = 1;
            queens++;
            printBoard(board, size);
            if((row+1)!=size){
                solveBoard(board, size, row+1, 0, memRow, memColumn, queens);
                printBoard(board, size);
            } 
        }
        if((column+1)!=size){
            solveBoard(board, size, row, column+1, memRow, memColumn, queens);
            memColumn[column] = 0;
            solveBoard(board2, size, row, column+1, memRow, memColumn, queens);
        }
    }

    public static void printBoard(int[][] board, int size){
        for(int n = 0; n < size; n++){
            for(int i = 0; i < size; i++){
                System.out.print(board[n][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkDiagonal(int[][] board, int size, int row, int column){
        int checkSize = row;
        boolean check = false;
        if(checkSize==0){
            check = true;
        }
        for(int n = 0; n < size; n++){
            if(checkSize>=1){
                if((column-checkSize)>=0){
                    if(board[n][column-checkSize]==1) check = true;
                }
                if((column+checkSize)<size){
                    if(board[n][column+checkSize]==1) check = true;
                }
            }
            checkSize--;
        }
        return check;
    }
}
