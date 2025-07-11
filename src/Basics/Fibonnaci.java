package Basics;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("FIBONNACI PROGRAM RUNNING");

        int n = 30;
        int a = 0;
        int b = 1;

        if(n==0) System.out.println(0);
        if(n < 2) System.out.println(n);
        else {
            for(int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
        }


        System.out.println(b);
    }
}
