/*
 * Wayne Bowie
 * 9/13/2016
 */

import java.io.*;
import java.util.Arrays;
import java.lang.*;

class bases {

    public static void main(String[] args) throws IOException{

        try(BufferedReader data = new BufferedReader(new FileReader("../Data/data.txt"))){ //Opens Data/data.txt
            String line;
            while((line = data.readLine())!=null){ //While line equals next line
                double ans;
                int smallest = 2, position = 0;
                String[] numbers = line.split(""); //Separate each number
                String[] sorted = Arrays.copyOf(numbers, numbers.length); //Copies main array
                Arrays.sort(sorted);
                if(sorted[sorted.length-1].matches("[a-f]+")){ //Checks for a-f
                    smallest = convertToInt(sorted[sorted.length-1]) + 1; //Value of letter + 1 = base
                } else {
                    smallest = Integer.parseInt(sorted[sorted.length-1])+1; //Value of number + 1 = base
                }

                System.out.println("Base conversion for " + line + "\n");
                for(int base = smallest; base <= 16; base++){ //Go through each base
                    position = 0;
                    ans = 0;
                    for(int num = numbers.length-1; num > 0; num--){ //Num = Amount of numbers
                        if(numbers[num].matches("[a-f]+")){ //Checks for a-f
                            ans += (convertToInt(numbers[num]) * (Math.pow(base,position))); //Value of letter * (base^position)
                        } else {
                            ans += (Integer.parseInt(numbers[num]) * (Math.pow(base,position))); //Value of number * (base^position)
                        }
                        position++;
                    }
                    System.out.println("Base " + base + " => " + ans);
                }
                System.out.println();
            }
        }
    }

    public static int convertToInt(String letter){ //Converts the letter into their value
        int converted = 0;
        switch(letter){
            case "a":
                converted = 10;
                break;
            case "b":
                converted = 11;
                break;
            case "c":
                converted = 12;
                break;
            case "d":
                converted = 13;
                break;
            case "e":
                converted = 14;
                break;
            case "f":
                converted = 15;
                break;
        }
        return converted;
    }

}
