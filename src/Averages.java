/*
Given an array, find the averages of first and last subarrays of 'jump' contiguous elements in it.
        {5, 13, 24, 56, 7, 8, 11, 98, 57, 23, 56, 21, 33, 72, 82, 9, 10, 48, 30, 61};
        Example: if jump = 3;
        Average of 5 and 24 is 14.5, then average of 13 and 56 is 34.5, and etc.
       Output all the averages into a new array or arraylist.
        Show in the console the higher number and the smallest number of the new array.
 */

public class Averages {
    public static void main(String[] args) {
        int[] array = {5, 13, 24, 56, 7, 8, 11, 98, 57, 23, 56, 21, 33, 72, 82, 9, 10, 48, 30, 61};
        int jump = 3;

        double highest = Double.MIN_VALUE;
        double smallest = Double.MAX_VALUE;

        for (int i = 0; i <= array.length - jump; i += jump) {
            double sum = array[i] + array[i + jump - 1];
            double average = sum / 2.0; // Divide by 2 to find average of two elements

            if (average > highest) {
                highest = average;
            }
            if (average < smallest) {
                smallest = average;
            }

            System.out.println("Average of subarray starting at index " + i + ": " + average);
        }

        System.out.println("\nHighest number in the new array: " + highest);
        System.out.println("Smallest number in the new array: " + smallest);
    }
}
