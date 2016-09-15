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
            while((line = file.readLine()) != null){
                String[] leftHand = line.substring(1,5).split(""); //Gets first 5 numbers
                String[] rightHand = line.substring(5).split(""); //Gets last 5 numbers
                boolean leftValid = checkValidity(leftHand, 0);
                boolean rightValid = checkValidity(rightHand, 1);
                double count = 0;
                if(leftValid && rightValid){
                    for(int leftPos = 0; leftPos < 4; leftPos++){
                        if(leftHand[leftPos].equals("1")){
                            count += 10;
                        }
                    }
                    for(int rightPos = 2; rightPos < 5; rightPos++){
                        if(rightHand[rightPos].equals("1")){ count += 1; }
                    }
                    if(rightHand[1].equals("1")) { count += 5; }
                    if(leftHand[4].equals("1")) { count += 50; }
                    System.out.println(line + " -> "+ count);
                } else {
                    System.out.println(line + " -> Invalid");
                }
            }
        }
    }

    static boolean checkValidity(String[] check, int hand){
        boolean valid = true;
        if(hand==0){ //For left hand
            for(int l = 1; l < 4; l++){ //Get the 4 left fingers
                if(check[l-1].equals("1") && !check[l].equals("1")){
                    valid = false;
                }
            }
        } else {
            for(int r = 2; r < 5; r++){ //Get the 4 right fingers
                if(check[r+1].equals("1") && !check[r].equals("1")){
                    valid = false;
                }
            }
        }
        return valid;
    }
}
