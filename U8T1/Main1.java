public class Main1 {
    public static void main(String[] args) {
        // String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, 
        // {"Brian","Eleanor", "Harry", "Lenny"}, 
        // {"Cathy", "Fred", "Jill", "Matt"}};
        // for (String[] r : seatingChart) {
        //     for (String name : r) {
        //         System.out.print(name + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // seatingChart[1][2] = "Paul";
        // for (String[] r : seatingChart) {
        //     for (String name : r) {
        //         System.out.print(name + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // String temp = seatingChart[0][0];
        // seatingChart[0][0] = seatingChart[2][3];
        // seatingChart[2][3] = temp;
        // for (String[] r : seatingChart) {
        //     for (String name : r) {
        //         System.out.print(name + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // String[] temp1 = seatingChart[0];
        // seatingChart[0] = seatingChart[1];
        // seatingChart[1] = temp1;
        // for (String[] r : seatingChart) {
        //     for (String name : r) {
        //         System.out.print(name + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        // int[][] arr1 = new int[2][3];
        // String[][] arr2 = new String[4][2];

        // for (int[] n : arr1) {
        //     for (int num : n) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }

        // for (String[] s : arr2) {
        //     for (String string : s) {
        //         System.out.print(string + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();

        // arr1[0][0] = 1;
        // arr1[0][1] = 2;
        // arr1[0][2] = 3;
        // arr1[1][0] = 4;
        // arr1[1][1] = 5;
        // arr1[1][2] = 6;

        // for (int[] n : arr1) {
        //     for (int num : n) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }

        // arr2[0][0] = "a";
        // arr2[0][1] = "b";
        // arr2[1][0] = "c";
        // arr2[1][1] = "d";
        // arr2[2][0] = "e";
        // arr2[2][1] = "f";
        // arr2[3][0] = "g";
        // arr2[3][1] = "h";

        // for (String[] s : arr2) {
        //     for (String string : s) {
        //         System.out.print(string + " ");
        //     }
        //     System.out.println();
        // }

        // TEST CODE FOR swapFrontAndBackRows
        System.out.println("-------TEST 1-------");
        String[][] w1 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        System.out.println("--Original:");
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w1);
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-------TEST 2-------");
        String[][] w2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        System.out.println("--Original:");
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w2);
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------TEST 3-------");
        String[][] w3 = {{"phone", "mouse", "keyboard"}};
        System.out.println("--Original:");
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w3);
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------TEST 4-------");
        String[][] w4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        System.out.println("--Original:");
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w4);
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------TEST 5-------");
        String[][] w5 = {{"time"}};
        System.out.println("--Original:");
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w5);
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }



    }
}