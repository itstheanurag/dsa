package Basics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(12));
    }

    static int factorial(int n) {
        int factorial = 1;
        if(n == 0 || n == 1) return 1;

        for(int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
