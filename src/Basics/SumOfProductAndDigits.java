package Basics;

public class SumOfProductAndDigits {
    public static void main(String[] args) {
        System.out.println(calculate(234));
        System.out.println(calculate(4421));
    }

    static int calculate(int n) {
        int sum = 0;
        int prod = 1;

        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n = n / 10;
        }

        return prod - sum;
    }
}


/*
1281. Subtract the Product and Sum of Digits of an Integer
Easy
        Topics
premium lock icon
        Companies
Hint
Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
 */