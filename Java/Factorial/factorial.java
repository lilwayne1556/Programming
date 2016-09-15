import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        int number;
        long results;
        Scanner obj = new Scanner(System.in);
        System.out.print("Factorial to caclulate: ");
        number = obj.nextInt();
        results = factorial(number);
        System.out.println(results);
    }

    public static long factorial(int n){
        long number = 0;
        if(n==1){
            return 1;
        } else {
            number = n * factorial(n-1);
        }
        return number;
    }
}
