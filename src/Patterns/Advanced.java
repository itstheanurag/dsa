package Patterns;

public class Advanced {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(8);
//        pattern3(5);
        pattern4(5);
    }

    /*

         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

     * */
    static void pattern4(int n) {
        int totalRows = 2 * n - 1;

        for (int row = 0; row < totalRows; row++) {
            int currentRow = row < n ? row : 2 * n - row - 2;

            // Print leading spaces
            for (int space = 0; space < n - currentRow - 1; space++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            if (currentRow > 0) {
                // Print internal spaces
                for (int space = 0; space < 2 * currentRow - 1; space++) {
                    System.out.print(" ");
                }

                // Print second star
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*

     *********
      *     *
       *   *
        * *
         *

     * */
    static void pattern3(int n) {
        for (int row = 0; row < n ; row++) {
            if(row == 0) {
                for(int col = 0; col < 2 * n - 1; col++) {
                    System.out.print("*");
                }
            } else {
                for(int col = 0; col < 2 * n - 1 ; col++) {
                    if(col == row) {
                        System.out.print("*");
                    } else if(col == 2*n - row - 2) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
            }

            System.out.println();
        }
    }

    /*

         *
        * *
       *   *
      *     *
     *********

     * */
    static void pattern2(int n) {
        for (int row = 0; row < n ; row++) {
            if(row == n - 1) {
                for(int col = 0; col < 2 * n - 1; col++) {
                    System.out.print("*");
                }
            } else {
                for(int col = 0; col < 2 * n - 1 ; col++) {
                    if(col == n - row - 1) {
                        System.out.print("*");
                    }
                    else if(col == n + row - 1) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
            }

            System.out.println();
        }
    }

    /*

     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

     * */
    static void pattern1(int n) {
        int max = 2 * n;
        for (int row = 0; row < max ; row++) {
            if(row < n) {
                for(int space = 0; space <  row; space++) {
                    System.out.print(" ");
                }

                for(int col = 0; col < n - row; col++) {
                    System.out.print("* ");
                }

            } else {
                for(int space = 0; space <  max - row - 1; space++) {
                    System.out.print(" ");
                }

                for(int col = 0; col < row - n + 1; col++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
