// ArraysAndVectors.java
// Nishma Lopez
// 8/4/23

public class ArraysAndVectors {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Array Program!\n");

        // Create an int Array
        int[] myNumbers = new int[8];

        // Fill the array with ints

        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        // output the array
        System.out.println("myNumbers[3] = " + myNumbers[3]);

        System.out.println("\n\n");

        for (int i = 0; i <= 7; i++) {
            // print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // fill the array with 5, 10, 15, etc.
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {
            // print the elements of the array
            myNumbers[i] = myFiveContainer += 5;
        }

        System.out.println("\n\nthis array should be fives:");
        for (int i1 = 0; i1 <= 7; i1++) {
            // print the elements of the array
            System.out.println("myNumbers[" + i1 + "] is: " + myNumbers[i1]);

        int [][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };
        System.out.println( numberGrid[0][0]);

        for(int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j]);
            }
            System.out.println();
        }

        //Create a 2D array
        int[][] myNumberGrid = new int[4][3];

        // find the array with a for() loop!
            myFiveContainer = 0;
        for (int i = 0; i < myNumberGrid.length; i++) {
            for (int j = 0; j < myNumberGrid[i].length; j++) {
                myNumberGrid[i][j] = myFiveContainer += 5;
            }
        }
            // output the array with a for() loop!
            System.out.println("\n\n");
            myFiveContainer = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(myNumberGrid[i][j]);
                }
                System.out.println("");
            }
        }
    }

}
