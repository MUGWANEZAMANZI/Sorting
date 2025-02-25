package sort;

import java.util.Random;

public class Sort {
    public static final int SIZE = 1_000_000; // One million integers
    public static int[] arr = new int[SIZE];

    // Generates an array with random numbers between 0 and 100
    public void generateArray() {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = rand.nextInt(101); // Random number from 0 to 100
        }
    }

    // Displays the array (for debugging)
    public void displayArray() {
        for (int i = 0; i < Math.min(SIZE, 100); i++) { // Print only first 100 elements for visibility
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



