public class FunWith2DArrays {
    public static int totalElements(int[][] ints) {
        return ints.length * ints[0].length;    
    }

    public static void fourCorners(String[][] strings) {
        System.out.println(strings[0][0]);
        System.out.println(strings[0][strings[0].length - 1]);
        System.out.println(strings[strings.length - 1][0]);
        System.out.println(strings[strings.length - 1][strings[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] strings) {
        String[] temp = strings[0];
        strings[0] = strings[strings.length - 1];
        strings[strings.length - 1] = temp;
    }

    public static double average(int[][] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum / (nums.length * nums[0].length);
    }

    public static int edgeSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            sum += nums[0][i];
        }

        for (int j = 1; j < nums.length - 1; j++) {
            sum += nums[j][0];
            sum += nums[j][nums[0].length - 1];
        }

        for (int k = 0; k < nums[0].length; k++) {
            sum += nums[nums.length - 1][k];
        }
        
        return sum;
    }
    
    public static int[] indexFound(String[][] strings, String target) {
        int[] found = new int[2];
        for (int i = 0; i < strings[0].length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[j][i].equals(target)) {
                    found[0] = j;
                    found[1] = i;
                    return found;
                }
            }
        }
        found[0] = -1;
        found[1] = -1;
        return found;
    }

    public static int[][] split(int[][] nums, int row, int column) {
        int[][] portion = new int[row + 1][column + 1];
        if (row > nums.length - 1 || column > nums[0].length - 1) {
            return new int[0][0];
        } else {
            for (int i = 0; i <= row; i++) {
                for (int j = 0; j <= column; j++) {
                    portion[i][j] = nums[i][j];
                }
            }
        }
        return portion;
    }

    public static int[][] invert(int[][] nums) {
        int[][] inverted = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                inverted[i][j] = nums[j][i];
            }
        }
        return inverted;
    }
}
