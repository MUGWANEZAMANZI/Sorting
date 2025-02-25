package sort;

public class Insertion extends Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.generateArray();
        System.out.println("Before Insertion Sort:");
        s.displayArray();

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("After Insertion Sort:");
        s.displayArray();
    }
}
