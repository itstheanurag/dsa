package Patterns;

public class Patterns {
    public static void main(String[] args) {
//        pattern(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(8);
//        pattern8(5);
//        pattern9(5);
        pattern10(5);
//        pattern11(5);

    }



    /*
     * * * * *
      * * * *
       * * *
        * *
         *

     * */
    static void pattern11(int n) {
        for (int row = 0; row <  n; row++) {
            for(int space = 0; space <  row; space++) {
                System.out.print(" ");
            }

            for(int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
         *
        * *
       * * *
      * * * *
     * * * * *

     * */
    static void pattern10(int n) {
        for (int row = 0; row <  n; row++) {
            for(int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }

            for(int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    /*
     *********
      *******
       *****
        ***
         *
     * */
    static void pattern9(int n) {
        for (int row = 0; row <  n; row++) {
            for(int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            for(int col = 0; col < n - row - 1; col++) {
                System.out.print("*");
            }

            for(int col = 0; col < n - row  ; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void patternNine(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            int totalStars = 2 * (n - row) - 1;
            for (int col = 0; col < totalStars; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }



    /*
         *
        ***
       *****
      *******
     *********
     * */
    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < row * 2 + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternEightBetter(int n) {
        for (int row = 0; row < n; row++) {
            int totalCols = n + row; // total columns = spaces + stars
            for (int col = 0; col < totalCols; col++) {
                if (col < n - row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    /*

     *****
      ****
       ***
        **
         *

     * */
    static void pattern7(int n) {
        for (int row = 0; row <  n; row++) {
            for(int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            for(int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    /*

         *
        **
       ***
      ****
     *****

     * */
    static void pattern6(int n) {
        for (int row = 1; row <=  n; row++) {
            int spaces = n - row;
            for(int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <=row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    /*

     *****
     *****
     *****
     *****
     *****

    * */
    static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            for(int col = 1; col < n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /*

     *
     **
     ***
     ****
     *****

     * */
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*

     *****
     ****
     ***
     **
     *

     * */
    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }



    /*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     * */
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
        System.out.println();
    }


    /*

     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *

     * */
    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int colsToPrint = row > n ? 2 * n - row: row;
            for(int col = 1; col <=colsToPrint; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
