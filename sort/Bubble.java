package sort;

public class Bubble extends Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.generateArray();
        System.out.println("Before Bubble Sort:");
        s.displayArray();

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Bubble Sort:");
        s.displayArray();
    }
}




//Bubble sort takes, more than 3 minute