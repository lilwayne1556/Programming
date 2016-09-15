import java.util.Scanner;
class Tower {
    public static void main(String[] args){
        int size = 3;
        Scanner obj = new Scanner(System.in);
        //Asks user for number of disks they want
        System.out.print("How many disks do you want? ");
        size = obj.nextInt();
        obj.close();
        /*
         * Creates 2D Array
         * 3 Rows for the 3 different rods
         * Size number of disks
         */
        int[][] Tower = new int[3][size]; 
        for(int n = 0; n < size; n++){
            Tower[0][n] = size - n;
        }
        //Prints out initial Towers
        printArray(Tower, size);
        /*
         * Starts the movement process
         * Sends in, Tower 2D Array, Position for A, B, C, Beginning disk, Max size
         */
        move(Tower, 0, 1, 2, size, size);
    }//end main
    
    //the method that tells what to move
    public static void move(int[][] tower, int a, int b, int c, int g, int size){
        if(g == 1){
        	//Moves disk from tower A to tower C if disk = 1
            tower = basicMove(tower, a, c, size);
        } else {
        	/*
        	 * Recursion
        	 * 
        	 * Moves disks from tower A until g = 1
        	 * Moves disk from tower A to tower C
        	 * Moves disks from tower B until g = 1
        	 * Moves all disks from tower A to tower C
        	 */
            move(tower, a, c, b, g-1, size);
            tower = basicMove(tower, a, c, size);
            move(tower, b, a, c, g-1, size);
        }
        
    }//end move
    
    public static int[][] basicMove(int[][] tower, int a, int c, int size){
    	/*
    	 * 
    	 */
        for(int i = size-1; i >= 0; i--){
            for(int n = 0; n < size-1; n++){
                if(tower[a][i]!=0 && tower[c][n]==0 && n==0){
                    tower[c][n] = tower[a][i];
                    tower[a][i] = 0;
                    printArray(tower, size);
                } else if(tower[a][i]!=0 && tower[c][n]>tower[a][i] && tower[c][n+1]==0){
                    tower[c][n+1] = tower[a][i];
                    tower[a][i] = 0;
                    printArray(tower, size);
                } 
            }
        }
        return tower;
    }//end basicMove
 
    public static void printArray(int[][] tower, int size){
        for(int p = 0; p < size; p++){
            System.out.print(tower[0][p] + " ");
        }
        System.out.println();
        for(int p = 0; p < size; p++){
            System.out.print(tower[1][p] + " ");
        }
        System.out.println();
        for(int p = 0; p < size; p++){
            System.out.print(tower[2][p] + " ");
        }
        System.out.println("\n");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }//end printArray


}//end class
