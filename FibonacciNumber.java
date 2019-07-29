package HomeWork81;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int result = numberOfFibonacci(n);
        System.out.println(result);

    }
    private static int numberOfFibonacci (int n){
        if (n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else {
        return numberOfFibonacci(n-1) + numberOfFibonacci(n - 2);
        }
    }
}
