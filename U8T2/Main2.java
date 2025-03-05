import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // /* --- PROBLEM 1 --- */
        // System.out.println("PROBLEM 1:");
        // int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        // System.out.println("---------");
        // // write code below that uses nested ENHANCED for loops
        // // to print each element in nums in ROW-MAJOR order again;
        // // print all the numbers in a row on the same line
        // // with a space in between

        // // write code here
        // for (int[] r : nums) {
        //     for (int num : r) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }

        // // now, write code below that uses nested INDEX-BASED for loops
        // // to print each element in nums in ROW-MAJOR order;
        // // print all the numbers in a row on the same line
        // // with a space in between

        // // write code here
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[0].length; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
          

        // System.out.println("---------");
        // // finally, write code below that uses nested for loops
        // // to print each element in nums in COLUMN-MAJOR order;
        // // print all the numbers in a COLUMN on the same line
        // // with a space in between

        // // write code here
        // for (int i = 0; i < nums[0].length; i++) {
        //     for (int j = 0; j < nums.length; j++) {
        //       System.out.print(nums[j][i] + " ");
        //     }
        //     System.out.println();
        // }

        // /* --- PROBLEM 2 --- */
        // System.out.println("---------");
        // System.out.println("PROBLEM 2:");

        // String[][] animals = {
        //         {"anteater", "bird"},
        //         {"camel", "dog"},
        //         {"elephant", "giraffe"},
        //         {"hyena", "jackal"}
        // };
        // // write code below using a nested loop to update each element
        // // in animals to its plural form, e.g. bird --> birds;
        // // (no printing yet)

        // // write code here
        // for (int i = 0; i < animals.length; i++) {
        //     for (int j = 0; j < animals[0].length; j++) {
        //         animals[i][j] += "s";
        //     }
        // }

        // // next, write code below to print out the 2D
        // // array in column-major order, showing each
        // // animal in inside a bracketed "enclosure"
        // // using "|" (like fences separating animal pens
        // // in a zoo)

        // // write code here
        // for (int i = 0; i < animals[0].length; i++) {
        //     System.out.print("|");
        //     for (int j = 0; j < animals.length; j++) {
        //       System.out.print(animals[j][i] + "|");
        //     }
        //     System.out.println();
        // }

        // TEST CODE FOR invert
        System.out.println("---invert test1---");
        int[][] test1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] ts1 = FunWith2DArrays.invert(test1);
        for (int[] row : ts1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("orig array not modified:");
        for (int[] row : test1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("\n---invert test2---");
        int[][] test2 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] ts2 = FunWith2DArrays.invert(test2);
        for (int[] row : ts2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("\n---invert test3---");
        int[][] test3 = {{10}};
        int[][] ts3 = FunWith2DArrays.invert(test3);
        for (int[] row : ts3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}