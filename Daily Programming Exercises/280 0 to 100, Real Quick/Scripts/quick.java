/*
 * Wayne Bowie
 * 9/14/2016
 */

import java.io.*;
import java.util.Arrays;

class quick{

    public static void main(String[] args) throws IOException{

        try(BufferedReader file = new BufferedReader(new FileReader("../Data/data.txt"))) {
            String line;
            boolean leftValid, rightValid;
            double count;
            while((line = file.readLine()) != null){
                String[] leftHand  = line.replaceFirst("(\\d{5})$", "").split("");                         // Gets first 5 numbers
                String[] rightHand = line.replaceFirst("^(\\d{5})", "").split("");                           // Gets last 5 numbers
                leftValid          = checkValidity(leftHand, 0);                            // Checks if left hand is correct, checkValidity(Left Hand, Left)
                rightValid         = checkValidity(rightHand, 1);                           // Checks if right hand is correct, checkValidity(Right Hand, Right)
                count              = 0;
                if(leftValid && rightValid){
                    for(int leftPos = 1; leftPos < 5; leftPos++){                           // Checks left index fingers and add 10 for each
                        if(leftHand[leftPos].equals("1")){                                  // Makes sure the digit equals 1
                            count += 10;
                        }
                    }
                    for(int rightPos = 2; rightPos < 5; rightPos++){                        // Check right index fingers and add 1 for each
                        if(rightHand[rightPos].equals("1")){ count += 1; }
                    }
                    if(rightHand[1].equals("1")) { count += 5; }                            // If right thumb is out, then add 5
                    if(leftHand[5].equals("1")) { count += 50; }                            // If left thumb is out, then add 50
                    System.out.println(line + " -> "+ count);                               // Output
                } else {
                    System.out.println(line + " -> Invalid");
                }
            }
        }
    }

    static boolean checkValidity(String[] check, int hand){
        boolean valid = true;
        if(hand==0){                                                                        // For left hand
            for(int l = 1; l < 4; l++){                                                     // Get the 4 left fingers
                if(check[l-1].equals("1") && !check[l].equals("1")){                        // If the last digit equal and the current digit doesn't then it's invalid
                    valid = false;
                }
            }
        } else {
            for(int r = 2; r < 5; r++){                                                     // Get the 4 right fingers
                if(check[r+1].equals("1") && !check[r].equals("1")){                        // If the next digit equals 1 while the current doesnt, then it's invalid
                    valid = false;
                }
            }
        }
        return valid;
    }
}
