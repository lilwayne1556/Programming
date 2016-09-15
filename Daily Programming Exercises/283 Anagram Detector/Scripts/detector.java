/*
 * Wayne Bowie
 * 9/12/2016
 */

import java.io.*;
import java.util.Arrays;                                                                    // For Array sort

class detector {

    public static void main(String[] args) throws IOException{

        try (BufferedReader data = new BufferedReader(new FileReader("../Data/data.txt"))){ // Try with... Open data file
            String line;
            while((line = data.readLine()) != null){                                        // Read by line
                boolean checker = false;
                String out = " is NOT an anagram of ";
                line = line.toLowerCase();                                                  // Makes each character lowercased
                line = line.replaceAll(" ", "");                                            // Gets rid of spaces
                //line = line.replaceAll("\"", "");                                           // Gets rid of "
                line = line.replaceAll("\'", "");                                           // Gets rid of '
                String[] parts = line.split(":");                                           // Separates the two different phrases/words
                String cache1 = parts[0];
                String cache2 = parts[1];

                char[] part1 = parts[0].toCharArray(); //Coverts each String into a char
                char[] part2 = parts[1].toCharArray();

                Arrays.sort(part1); //Sorts each array alphabetically
                Arrays.sort(part2);

                if(Arrays.equals(part1, part2)){ //Checks to see if each Array is equal
                    out = " is an anagram of ";
                }

                System.out.println(parts[0] + out + parts[1]); //Prints output
            }
        }
    }
}
