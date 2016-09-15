class StringClassMethods {
    public static void main(String[] args){
        String[] myWords = new String[20];
        String word = "Summer vacation is almost here!";
        myWords[0] = word.charAt(24) + word.substring(26,30);
        myWords[1] = word.substring(21, 25);
        myWords[2] = word.substring(21, 23) + word.charAt(14) + word.substring(23, 25) + word.substring(27,29);
        myWords[3] = word.substring(21, 23) + word.substring(28,30);
        myWords[4] = word.substring(16, 18) + word.charAt(20) + word.charAt(4);
        myWords[5] = word.charAt(1) + word.charAt(17) + word.substring(4,6);
        myWords[6] = word.substring(0,3);
        myWords[7] = Character.toString(word.charAt(5)) + Character.toString(word.charAt(8)) + word.charAt(2);
        myWords[8] = Character.toString(word.charAt(5)) + Character.toString(word.charAt(8)) + Character.toString(word.charAt(14));
        myWords[9] = Character.toString(word.charAt(5)) + Character.toString(word.charAt(1)) + Character.toString(word.charAt(14));
        myWords[10] = word.substring(9, 11);
        myWords[11] = word.substring(9, 10) + word.charAt(5);
        myWords[12] = Character.toString(word.charAt(0)) + Character.toString(word.charAt(22)) + Character.toString(word.charAt(8)) + Character.toString(word.charAt(5));
        myWords[13] = Character.toString(word.charAt(0)) + Character.toString(word.charAt(22)) + Character.toString(word.charAt(5)) + Character.toString(word.charAt(4));
        for(int n = 0; n < myWords.length; n++){
            System.out.println(myWords[n]);
        }
    }
}
