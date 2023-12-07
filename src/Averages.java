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

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < array.length - 2; i++) {
            int soma = array[i] + array[i + 2];
            double media = (double) soma / 2;

            if (media > maior) {
                maior = media;
            }
            if (media < menor) {
                menor = media;
            }

            System.out.println("A soma de " + i + " + " + (i + 2) + " = " + soma);
            System.out.println("A média do index " + i + "é: " + media);
        }

        System.out.println("\nO número mais alto da média é: " + maior);
        System.out.println("O menor número da média é: " + menor);
    }
}