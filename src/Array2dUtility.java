public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    static void print(int[][] my2dArray) {
        for (int[] row : my2dArray) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    static int sum(int[][] my2Array) {
        int sum = 0;
        for (int[] row : my2Array) {
            for (int col : row) {
                sum += col;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    static double average(int[][] myTwoArray) {
        int sum = sum(myTwoArray);
        int totalValues = myTwoArray.length * myTwoArray.length;
        return (double) sum / totalValues;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    static int minimum(int[][] myArray) {
        int min = Integer.MAX_VALUE;
        for (int[] row : myArray) {
            for (int col : row) {
                if (col < min) {
                    min = col;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    static int maximum(int[][] myArray) {
        int max = Integer.MIN_VALUE;
        for (int[] row : myArray) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    static int evenCountStandard(int[][] myArray) {
        int evenCount = 0;
        for (int i = 0; i < myArray.length; i ++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] % 2 == 0) {
                    evenCount += 1;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    static int evenCountEnhanced(int[][] myArray) {
        int evenCount = 0;
        for (int[] row : myArray) {
            for (int col : row) {
                if (col % 2 == 0) {
                    evenCount += 1;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    static boolean allPositive(int[][] myArray) {
        for (int[] row : myArray) {
            for (int col : row) {
                if (col < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    static int[] rowSums(int[][] myArray){
        int[] result = new int[myArray.length];
        int index = 0;
        for(int[] row : myArray){
            int rowSum = 0;
            for(int col : row){
                rowSum += col;
            }
            result[index] = rowSum;
            index++;
        }
        return result;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    static int[] colSums(int[][] myArray){
        int[] colSums = new int[myArray[0].length];
            for(int[] row : myArray){
                for(int i=0;i<row.length;i++){
                    colSums[i] += row[i];
                }
            }
        return colSums;
    }
}

