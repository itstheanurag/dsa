package Patterns;

public class NumberPattern {
    public static void main(String[] args) {

//        pattern(5);
//        pattern2(5);
//        pattern3(8);
//        pattern4(6);
//        pattern5(4);
//        pattern6(6);
        pattern7(6);
    }

    /*

       1      1
       12    21
       123  321
       12344321

     */
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=  i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4

    * */
    static void pattern6(int n) {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print((n - layer) + " ");
            }
            System.out.println();
        }
    }


    /**


          1 2 3 4  17 18 19 20
            5 6 7  14 15 16
              8 9  12 13
                10 11
  */
    static void pattern5(int n) {
        int val = 1;
        int totalNums = n * (n + 1) / 2;
        int maxVal = totalNums * 2;

        for (int r = 1; r <= n; r++) {
            // Print leading spaces
            for (int c = 1; c < r * 2; c++) {
                System.out.print(" ");
            }
            // Print left side numbers
            int count = n - r + 1;
            for (int i = 0; i < count; i++) {
                System.out.print(val + " ");
                val++;
            }
            // Calculate and print right side numbers
            int startRight = maxVal - (count - 1);
            for (int i = 0; i < count; i++) {
                System.out.print(startRight + (i < count - 1 ? " " : ""));
                startRight++;
            }

            maxVal -= count;
            System.out.println();
        }
    }





    /**
            1 1 1 1 1 1
            2 2 2 2 2
            3 3 3 3
            4 4 4
            5 5
            6
    */

    static void pattern4(int n) {
        for(int i = 1; i <= n; i++) {
            for(int c = 1; c <= n + 1  - i ; c++) {
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }


    /*

       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
    */

    // thought process, keep a count like thi
    static void pattern3(int n) {
        int val = 1;
        for(int i = 1; i <= n; i++) {
            for(int c = 0; c < i ; c++) {

                if(val % 2 == 0) {
                    System.out.print( 0 + " ");
                } else {
                    System.out.print( 1 + " ");
                }

                val = val + 1;
            }
            System.out.println();
        }
    }

    /*

       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
    */

    static void pattern2(int n) {
        int val = 1;
        for(int i = 1; i <= n; i++) {
            for(int c = 0; c < i ; c++) {
                System.out.print( val + " ");
                val = val + 1;
            }
            System.out.println();
        }
    }

     /*

         1
         2 3
         3 4 5
         4 5 6 7
         5 6 7 8 9

    */

    static void pattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int c= 0; c < i ; c++) {
                System.out.print(i + c + " ");
            }
            System.out.println();
        }
    }
}
