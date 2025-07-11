package Basics;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        System.out.println("PLEASE PROVIDE A POSITIVE NUMBER");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // take half cause if number is 50 then 26 can never be its factor
        for(int i = 1; i <= number/2; i++) {
            if(number % i == 0) {
                System.out.println(i + " Is a factor of number "+ number);
            }
        }
    }
}
