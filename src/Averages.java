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
        int[] list = {5, 13, 24, 56, 7, 8, 11, 98, 57, 23, 56, 21, 33, 72, 82, 9, 10, 48, 30, 61};
        int jump = 3;


        for (int i = 0; i <= list.length - jump; i++) {
            int sum = 0;
            for (int j = i; j < i + jump; j++) {
                sum += list[j];
            }
            double average = (double) sum / jump;
            System.out.println("Média do conjunto " + (i / jump + 1) + ": " + String.format("%.1f", average));
        }
    }
}
