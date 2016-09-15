import java.util.*; //Allow for input

class Fibonacci {

    public static void main(String[] args){
        //Creates an array for the cache of values
        long[] cache = new long[2];
        cache[0] = 0;
        cache[1] = 1;
        //Creates a temp variable
        long temp = 0;
        //Makes a scanner
        Scanner obj = new Scanner(System.in);
        //Ask for input
        System.out.print("How many digits do you want? ");
        //Receives input
        int numberOfDigits = obj.nextInt();
        for(int i = 0; i <= numberOfDigits; i++){
            if(i>0){
                System.out.print(",");
            }
            if(i<=1){
                System.out.print(cache[i]);
            } else {
                temp = cache[0] + cache[1];
                //Shifts array over by 1
                cache[0] = cache[1];
                cache[1] = temp;
                System.out.print(temp);
            }
        }
        System.out.println();
    }

    public static int getFibonacciSequence(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            return getFibonacciSequence(n-1) + getFibonacciSequence(n-2);
        }
    }
}
