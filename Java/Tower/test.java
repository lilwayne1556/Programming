import java.util.Scanner;
class test {
    public static void main(String[] args){
        int size = 3;
        int k = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("How many disks do you want? ");
        size = obj.nextInt();
        obj.close();
        int[][] Tower = new int[3][size]; 
        for(int n = 0; n < size; n++){
            Tower[0][n] = size - n;
        }
        printArray(Tower, size);
        while(Tower[1][size-1]!=1 && Tower[2][size-1]!=1){
            Tower = movePiece(Tower, k, false, size);
            if(k==3){
                k = 1;
            } else {
                k++;
            }
        }
        System.out.println("Finished");
        }
    public static int[][] movePiece(int[][] tower, int k, boolean moved, int size){
        int a = 0, b = 1, c = 2;
        switch (k){
            case 1:
                a = 0;
                b = 1;
                c = 2;
                break;
            case 2:
                a = 2;
                b = 0;
                c = 1;
                break;
            case 3:
                a = 1;
                b = 2;
                c = 0;
                break;
        }
        
        
               
        //Check for optimal move, n to n+3, empty space
        if(tower[0][0]!=size){
            moved = true;
        }
        
        tower = basicMove(tower, a, b, size, moved);
        tower = basicMove(tower, a, c, size, moved);
        tower = basicMove(tower, b, c, size, moved);
        
        tower = optimizedMove(tower, 0, 1, size, moved);
        tower = optimizedMove(tower, 0, 2, size, moved);
        tower = optimizedMove(tower, 2, 0, size, moved);
        tower = optimizedMove(tower, 2, 1, size, moved);
        tower = optimizedMove(tower, 1, 0, size, moved);
        tower = optimizedMove(tower, 1, 2, size, moved);

                
        return tower;
    }
    
    public static int[][] basicMove(int[][] tower, int a, int b, int size, boolean moved){
        for(int i = size-1; i >=0; i--){
            if(tower[1][0]==0 && tower[0][i]!=0){
                tower[1][0] = tower[0][i];
                tower[0][i] = 0;
                printArray(tower, size);
            }
            if(tower[2][0]==0 && tower[0][i]!=0){
                tower[2][0] = tower[0][i];
                tower[0][i] = 0;
                printArray(tower, size);
            }
        }
        for(int i = size-1; i >= 0; i--){
            for(int n = 0; n < size-1; n++){
                if((n==0 && tower[b][n]==0) && tower[a][i]!=0){
                    if((tower[a][i]==size && !moved) || (tower[a][i]!=size)){
                        tower[b][n] = tower[a][i];
                        tower[a][i] = 0;
                        printArray(tower, size);
                    }
                } else if(tower[b][n] > tower[a][i] && tower[a][i]!=0 && tower[b][n+1] == 0){
                    tower[b][n+1] = tower[a][i];
                    tower[a][i] = 0;
                    printArray(tower, size);
                } 
            }
        }
        
        return tower;
    }
    
    public static int[][] optimizedMove(int[][] tower, int a, int b, int size, boolean moved){
        for(int i = size-1; i >=0; i--){
            if(tower[1][0]==0 && tower[0][i]!=0){
                tower[1][0] = tower[0][i];
                tower[0][i] = 0;
                printArray(tower, size);
            }
            if(tower[2][0]==0 && tower[0][i]!=0){
                tower[2][0] = tower[0][i];
                tower[0][i] = 0;
                printArray(tower, size);
            }
        }
        for(int i = size-2; i >= 0; i--){
            for(int n = 0; n < size - 1; n++){
                if((((tower[a][i]+3)==tower[b][n] && tower[b][n]!=size)  || ((tower[a][i]+1)==tower[b][n])) && tower[b][n+1]==0 && tower[a][i+1]==0){
                    tower[b][n+1] = tower[a][i];
                    tower[a][i] = 0;
                    printArray(tower, size);
                }
            }
        }
        for(int i = size-1; i >=0; i--){
            if(tower[1][0]==0 && tower[0][i]!=0){
                tower[1][0] = tower[0][i];
                tower[0][i] = 0;
                printArray(tower, size);
            }
            if(tower[2][0]==0 && tower[0][i]!=0){
                tower[2][0] = tower[0][i];
                tower[0][i] = 0;
                printArray(tower, size);
            }
        }
        return tower;
    }
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
    }
}
