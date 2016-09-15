import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Wayne Bowie
 * 9/10/2016
 */

class bases {

    public static void main(String[] args){
                                                                                                                                                                                                                                                                                                                 // Fibinocci sequence pre generated
        long[] fib = {1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155,165580141,267914296,433494437,701408733,1134903170,1836311903};
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                                                                                               // Like Scanner, Reads everything from console
        String n = "";
        while(n.equals("q")==false){
            System.out.print("What do you want to convert? ");
            try{                                                                                                                                                                                                                                                                                                 // Must be here to use BufferedReader
                n = obj.readLine();
            }
            catch (IOException e){                                                                                                                                                                                                                                                                               // If the input screws up, print out the error
                System.out.println(e);
            }
            String[] split = n.split(" ");                                                                                                                                                                                                                                                                       // Split string to get either, F, 10, or Q
                                                                                                                                                                                                                                                                                                                 // F to convert to an integer
                                                                                                                                                                                                                                                                                                                 // 10 to convert to fibinocci binary
                                                                                                                                                                                                                                                                                                                 // q to quit
            if(split[0].equals("F")){
                System.out.println(fibToInt(split[1], fib));                                                                                                                                                                                                                                                     // fibToInt(Fibinocci Binary, Fibinocci Array)
            } else if(n.equals("q")==false){
                int num = Integer.parseInt(split[1]);                                                                                                                                                                                                                                                            // Changes the String into an integer for use in intToFib()
                System.out.println(intToFib(num, fib));                                                                                                                                                                                                                                                          // intToFib(Integer from above, Fibinocci Array)
            }
        }

    }

    public static String intToFib(int n, long[] array){
        String binary = "";
        boolean first = false;
        for(int i = array.length-1; i >= 0; i--){                                                                                                                                                                                                                                                                // Checks for the largest fibinocci number that is smaller than the int
            if(n >= array[i] && (n-array[i]) >= 0){
                first = true;                                                                                                                                                                                                                                                                                    // Used to not have extra 0s before the first 1
                binary += "1";
                n -= array[i];                                                                                                                                                                                                                                                                                   // Integer - Fibinocci Sequence
            } else if(first){
                binary += "0";
            }
        }
        return binary;
    }

    public static int fibToInt(String b, long[] array){
        int n = 0, p = 0;
        for(int i = b.length()-1; i >= 0; i--){                                                                                                                                                                                                                                                                  // Length of the fibinocci binary-1
            if(Character.getNumericValue(b.charAt(p))==1){                                                                                                                                                                                                                                                       // Coverts a char to an Integer
                                                                                                                                                                                                                                                                                                                 // p is used for the position of the character as i would produce the wrong value
                n += array[i];
            }
            p++;
        }
        return n;
    }
}
